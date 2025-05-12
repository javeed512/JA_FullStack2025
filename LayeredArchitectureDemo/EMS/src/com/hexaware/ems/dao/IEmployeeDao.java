package com.hexaware.ems.dao;

import java.util.List;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.exceptions.EmployeeNotFoundException;

public interface IEmployeeDao {
	
	int addEmployee(Employee emp);

	int updateEmployee(Employee emp);

	int deleteEmployee(int eid);

	List<Employee> getAllEmployees();
	
	List<Employee> getBySalaryGT(double sal);
	
	  Employee      getByEid(int eid)  throws  EmployeeNotFoundException;

}
