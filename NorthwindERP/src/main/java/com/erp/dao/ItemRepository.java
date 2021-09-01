package com.erp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.erp.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ItemRepository  {

	@Autowired
	JdbcTemplate template;

	/* Adding an item into database table */

	public int addEmployee(int id, String name, String department, String designation, String mobile, String email) {
		System.out.println("Inside Add Item");

		String query = "INSERT INTO employees VALUES(?,?,?,?,?,?)";
		return template.update(query, id, name, department, designation, mobile, email);
	}

	public int viewEmployee(int id, String name, String department, String designation, String mobile, String email) {
		System.out.println("Inside Add Item");

		String query = "INSERT INTO employees VALUES(?,?,?,?,?,?)";
		return template.update(query, id, name, department, designation, mobile, email);
	}

	/* Getting all Items from table */
	public List<Employee> ListEmployee() {
		List<Employee> items = template.query("select emp_id,name,department,designation,email,mobile from employees",
				(result, rowNum) -> new Employee(result.getInt("emp_id"), result.getString("name"),
						result.getString("department"), result.getString("designation"), result.getString("email"),
						result.getString("mobile")));
		return items;
	}

	/* Getting a specific item by item id from table */
	
	public List<Employee> ListEmployee(int itemId) {
 

		

		List<Employee> empDetail= template.query("SELECT * FROM employees WHERE emp_id=?",
				new Object[] { itemId }, new RowMapper<Employee>() {

					@Override
					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						Employee emp = new Employee();
	                      
						emp.setId(rs.getInt("emp_id"));
						emp.setName(rs.getString("name"));
						
						emp.setDepartment("department");
						emp.setDesignation("designation");
						emp.setEmail(rs.getString("email"));
						emp.setMobile(rs.getString("mobile"));

						return emp;
					}

				});
		
		
		
		
		
		return empDetail;
		
		
		

	

	}
	
	


	public ItemRepository() {
		super();
	}

}
