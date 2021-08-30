package com.erp.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.erp.model.Employee;


import java.util.List;

@Repository
public class ItemRepository {

    @Autowired
    JdbcTemplate template;


    /*Adding an item into database table*/
    
    public int addEmployee(int id,String name,String department,String designation,String mobile,String email){
    	System.out.println("Inside Add Item");
    	
        String query = "INSERT INTO employees VALUES(?,?,?,?,?,?)";
        return template.update(query,id,name,department,designation,mobile,email);
    }
    
    public int viewEmployee(int id,String name,String department,String designation,String mobile,String email){
    	System.out.println("Inside Add Item");
    	
        String query = "INSERT INTO employees VALUES(?,?,?,?,?,?)";
        return template.update(query,id,name,department,designation,mobile,email);
    }
    
    
    
    /*Getting all Items from table*/
    public List<Employee> ListEmployee(){
        List<Employee> items = template.query("select emp_id,name,department,designation,email,mobile from employees",(result,rowNum)->new Employee(result.getInt("emp_id"),
                result.getString("name"),result.getString("department"), result.getString("designation"), result.getString("email"),result.getString("mobile")));
        return items;
    }

 

	
	   /*Getting a specific item by item id from table*/
    public List<Employee>  ListEmployee(int itemId){
    	
    	System.out.println("Prabhakar " +itemId);
        String query = "SELECT * FROM employees WHERE emp_id=?";
        System.out.println("Prabhakar1 " +itemId);
        List<Employee> item =  template.query(query,new Object[]{itemId},new BeanPropertyRowMapper<>(Employee.class));
        System.out.println("Prabhakar2 " +itemId);
        return item ;
        
        
       /* 
        List<User> users = jdbcTemplate.query(sql,
                new Object[] { userType },
                new int[] { Types.VARCHAR },
                new BeanPropertyRowMapper(User.class));
        */
        
    }

	public ItemRepository() {
		super();
	}


	
   
}


