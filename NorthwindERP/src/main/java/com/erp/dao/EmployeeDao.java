package com.erp.dao;

import java.util.List;



import com.erp.model.Employee;

public interface EmployeeDao {

	public int addEmployee(Employee student);
	
	

	public List<Employee> listEmployee();
	
	
	
	public List<Employee> getEmployeeById(int studentId);
	
	public int deleteEmployee(int studentId);
	
	public int updateEmployee(Employee student);



	

	

}
