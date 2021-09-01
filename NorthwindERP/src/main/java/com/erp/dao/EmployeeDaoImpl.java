package com.erp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.erp.model.Employee;

import ch.qos.logback.core.net.SyslogOutputStream;
@Repository 
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addEmployee(Employee emp) {
		String sql = "insert into employees(emp_id,name,department,designation,email,mobile) values(?,?,?,?,?,?)";

		try {

			int empUpdate = jdbcTemplate.update(sql,new Object[] {emp.getId(), emp.getName(),emp.getDepartment(),emp.getDesignation(),emp.getEmail(),emp.getMobile() });

			return empUpdate;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	
	
	@Override
	public List<Employee> listEmployee() {
		List<Employee> studentList = jdbcTemplate.query("SELECT * FROM employees", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee student = new Employee();

				student.setId(rs.getInt("emp_id"));
				student.setName(rs.getString("name"));
				student.setDepartment(rs.getString("department"));
				student.setDesignation(rs.getString("designation"));
				student.setEmail(rs.getString("email"));
				student.setMobile(rs.getString("mobile"));
				

				return student;
			}

		});

		return studentList;
	}
	
	
	@Override
	
	public List<Employee> getEmployeeById(int studentId) {
	

		

		List<Employee> empDetail= jdbcTemplate.query("SELECT * FROM employees WHERE emp_id=?",
				new Object[] { studentId }, new RowMapper<Employee>() {

					@Override
					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						Employee emp = new Employee();
	                      
						emp.setId(rs.getInt("emp_id"));
						emp.setName(rs.getString("name"));
						
						emp.setDepartment(rs.getString("department"));
						emp.setDesignation(rs.getString("designation"));
						emp.setEmail(rs.getString("email"));
						emp.setMobile(rs.getString("mobile"));

						return emp;
					}

				});
		
		
		
		
		
		return empDetail;
		
		
	}





	@Override
	public int deleteEmployee(int studentId)  {
		
		System.out.println("ISHA");
		String sql = "delete from employees where emp_id=?";

		try {

			int counter = jdbcTemplate.update(sql, new Object[] { studentId });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}





	@Override

	public int updateEmployee(Employee emp) {
		
		System.out.println("DELETE SADEESH");
		String sql = "update employees set name=?, department=?, designation=? ,email=? ,mobile=? where emp_id=?";

		try {

			int counter = jdbcTemplate.update(sql,
			
					
					new Object[] { emp.getName(),emp.getDepartment(),emp.getDesignation(),emp.getEmail(),emp.getMobile(),emp.getId()});
			System.out.println("SADEESH SUCESS ="+emp.getName());
			
			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}




/*	
 * 
 * 
 * 
 * 
 * 
		name="emp_id"
	name="name"
	name="department"
	name="designation"
	name="email"
	name="mobile"
	
	
	CREATE TABLE `employees` (
			  `emp_id` INT(11) NOT NULL ,    
			  `name` VARCHAR(50) DEFAULT NULL,
			  `department` VARCHAR(50) DEFAULT NULL,
			  `designation` VARCHAR(50) DEFAULT NULL,
			  `email` VARCHAR(50) DEFAULT NULL,  
			  `mobile` VARCHAR(25) DEFAULT NULL,
	*/


}
