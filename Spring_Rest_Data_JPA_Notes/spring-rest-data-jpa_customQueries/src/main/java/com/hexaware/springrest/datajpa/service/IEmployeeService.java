package com.hexaware.springrest.datajpa.service;

import java.util.List;

import com.hexaware.springrest.datajpa.entity.Employee;

public interface IEmployeeService {

	
				public   Employee    addEmployee(Employee emp);
				public   Employee    updateEmployee(Employee emp);
				
				
				public   Employee   getByEid(int eid);
				public    String     deleteByEid(int eid);
				
				
				public   List<Employee>       getAllEmployees();
				
				
				public Employee  findByEname(String ename);
				
				public  List<Employee>    findBySalaryGreaterThan(double sal);
	
	
				public   List<Employee>       getAllEmployeesSortedBySalary();
				
				
				public  List<Employee>  	findBySalaryRange(double min , double max);


				public int  updateSalary(double salary , int eid);


				public  List<Employee>  getAllBySQL();	
				
}
