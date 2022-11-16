package com.ashokit.employee.EmployeeManagement.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.employee.EmployeeManagement.model.Employee;
import com.ashokit.employee.EmployeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	Map<Integer,Employee> empMap=null;
	
	/*
	 * EmployeeService(){ empMap= new HashMap<>(); empMap.put(123,new Employee(123,
	 * "Karthik", 10000)); empMap.put(124,new Employee(124, "Ashok", 20000)); }
	 */
	
	@Autowired
	EmployeeRepository empRepository;
	
	public List<Employee> getEmpDetails() {
		return (List<Employee>) empRepository.findAll();
	}
	public Employee getEmpDetailById(int empId) {
		return empRepository.findByEmpId(empId);
	}
	
	public void addEmployee(Employee e) {
		
		empRepository.save(e);
	}
	
	public void updateEmployee(Employee e,int empId) {
		
		Employee emp=getEmpDetailById(empId);
		if(emp!=null) {
			empRepository.save(e);
		}
		
	}

}
