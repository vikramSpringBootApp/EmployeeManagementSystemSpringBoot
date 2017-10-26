package com.example.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.MediaType;
import com.example.springboot.model.Employee;
import com.example.springboot.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;

@RestController
@Api(value="employee", description="Operations pertaining to products in Online Store")
@RequestMapping("/employee")
public class EmployeeController {


	@Autowired
	EmployeeService employeeService;
	
	@ApiOperation(value="employee" , response = Iterable.class)
	@RequestMapping(value = "/HomePage/listallemployee", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> listAllEmployee(){
		List<Employee> empAll = employeeService.findAllEmployees();
		return empAll;
	}
	
	@ApiOperation(value="employee" , response= Iterable.class)
	@RequestMapping(value= "/HomePage/createEmployee", method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee createEmployee(@RequestBody Employee employee ,UriComponentsBuilder ucBuilder){
		employeeService.saveEmployee(employee);
		return employee;
		
	}
	
	@ApiOperation(value="employee" , response = Iterable.class)
	@RequestMapping(value="/HomePage/updateEmployee" , method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		employeeService.updateEmployee(employee);
		return employeeService.findEmployee(employee.getEmpId());
	}
	
	@ApiOperation(value="employee", response= Iterable.class)
	@RequestMapping(value="/HomePage/searchEmployee/{empid}", method = RequestMethod.GET, produces = "application/json")
	public Employee findEmployee(@PathVariable("empid") long empid)
	{
		return employeeService.findEmployee(empid);
	}
}
