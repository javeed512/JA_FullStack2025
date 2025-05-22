package com.hexaware.springrestjpa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.repository.EmployeeRepository;
import com.hexaware.springrestjpa.restcontroller.EmployeeRestController;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	EmployeeRepository repo;

	
	Logger logger =	   LoggerFactory.getLogger(EmployeeServiceImp.class);
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		logger.info("add service is called");

		return repo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(long eid) {

		/*
		 * Optional<Employee> optional = repo.findById(eid); Employee emp = null;
		 * 
		 * if (optional.isPresent()) {
		 * 
		 * emp = optional.get(); }
		 */
		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deleteEmployeeById(long eid) {
		
		

		repo.deleteById(eid);

		logger.debug("record deleted by service");
		
		return "Record Deleted";
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		logger.info("all records fetch");

		return repo.findAll();

	}

	@Override
	public List<Employee> getByEname(String ename) {
		
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalaryGT(double salary) {
		
	
		
		
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getBySalarySorted() {
	
		return repo.findAll(Sort.by(Order.desc("salary")));
		
				
		
		//return	repo.findAll(Sort.by("salary"));
		
	}

	@Override
	public List<Employee> getBySalaryRange(double min, double max) {
		
		return repo.getBySalRange(min, max);
	}

	@Override
	public int deleteByEname(String ename) {
	
		return repo.deleteByEname(ename);
	}

	@Override
	public int updateSalary(double sal, long id) {
		
		return   repo.updateSalary(sal, id);
	}
	
	
	
	// input validations
	
	  public  static boolean  validateEmployee(Employee emp) {
		  
		   boolean flag = false;
		  
		  	if(emp.getEid() > 0 &&  emp.getEname().length() >= 4 &&  emp.getSalary() > 5000) {
		  		
		  		
		  		flag = true;
		  		
		  		
		  	}
		  
		  return flag;
		  
		  
	  }
	
	
	
	
	
	
	
	
	
	

}
