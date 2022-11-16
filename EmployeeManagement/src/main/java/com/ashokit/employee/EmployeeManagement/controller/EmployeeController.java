package com.ashokit.employee.EmployeeManagement.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.employee.EmployeeManagement.model.Employee;
import com.ashokit.employee.EmployeeManagement.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@GetMapping(path="/getEmpDetails")
	public List<Employee> getEmpDetails(){
		return empService.getEmpDetails();
		
	}
	
	@GetMapping(path="/getEmpDetails/{empId}")
	public Employee getEmpDetailById(@PathVariable int empId){
		return empService.getEmpDetailById(empId);
		
	}
	
	@PostMapping(path="/addEmployee")
	public void addEmployee(@RequestBody Employee e){
		 empService.addEmployee(e);
		
	}
	
	@PutMapping(path="/updateEmployee/{id}")
	public void updateEmployee(@RequestBody Employee e, @PathVariable("id") int empId){
		 empService.updateEmployee(e,empId);
		
	}
	
	/*
	 * @PostMapping(path="/getEmpDetails") public List<Employee> addEmpDetails(){
	 * return empList; }
	 */

}
