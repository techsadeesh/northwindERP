package com.erp.model;

public class Employee {
	private int id;
	private String name;
	private String department;
	private String designation;
	
	public Employee(int id, String name, String department, String designation, String mobile, String email) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.mobile = mobile;
		this.email = email;
	}


	private String mobile;
	private String email;



	public int getId() {
		return id;
	}

	public Employee() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
