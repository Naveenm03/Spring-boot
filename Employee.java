package com.example.demo;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity

@Table(name="employee")

public class Employee {

	@Id
	
	@Column(name="id")
	
	
	private int id;
	
	@Column(name="employee_name")
	
	private String employee_name;
	
	@Column(name="employeeAge")
	
	private int employeeAge;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public Employee() {
		
	}

	public Employee(int id, String employee_name, int employeeAge) {
		super();
		this.id = id;
		this.employee_name = employee_name;
		this.employeeAge = employeeAge;
	}
	
	
	
	

}





