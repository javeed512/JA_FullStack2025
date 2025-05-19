package com.hexaware.springmvc.service;

import java.util.List;

import com.hexaware.springmvc.entity.Employee;

public interface IEmployeeService {
	
	
	 public int   addEmployee(Employee  emp);
	 
	 public List<Employee>  getAllEmployees();
	
	

}
