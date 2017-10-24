package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.Employee;


public interface EmployeeService {

	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	void updateEmployee(Employee employee);
	
	Employee findEmployee(long empid);
	
	//Employee findByFirstNameLastName(String firstName, String lastName);
}
