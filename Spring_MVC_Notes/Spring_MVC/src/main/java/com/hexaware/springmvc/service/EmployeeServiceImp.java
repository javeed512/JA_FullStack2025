package com.hexaware.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springmvc.entity.Employee;
import com.hexaware.springmvc.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {
	
	
	@Autowired
	IEmployeeRepository repo;
	

	@Override
	public int addEmployee(Employee emp) {


		return repo.addEmployee(emp);
	}


	@Override
	public List<Employee> getAllEmployees() {


		return repo.getAllEmployees();
	}

}
