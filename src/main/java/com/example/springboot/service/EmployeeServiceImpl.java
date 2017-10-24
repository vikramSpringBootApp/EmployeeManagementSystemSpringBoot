package com.example.springboot.service;

import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.model.Employee;
import com.example.springboot.repositories.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRespository;

	@Override
	public void saveEmployee(Employee employee) {
		employeeRespository.save(employee);
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRespository.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		saveEmployee(employee);
		
	}

	@Override
	public Employee findEmployee(long empid) {
		
		return employeeRespository.findOne(empid);
	}

	/*@Override
	public Employee findByFirstNameLastName(String firstName, String lastName) {
		
		return employeeRespository.findByFirstNameLastName(firstName, lastName);
	}*/
	
	
	
}
