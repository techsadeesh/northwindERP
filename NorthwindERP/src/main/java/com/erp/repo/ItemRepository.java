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
    
    
    
    
    


	
   
}


