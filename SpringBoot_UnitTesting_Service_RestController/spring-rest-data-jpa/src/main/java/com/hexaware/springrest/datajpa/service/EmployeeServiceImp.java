package com.hexaware.springrest.datajpa.service;

import java.util.List;

import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.repository.EmployeeRepository;

@Transactional
@Service
public class EmployeeServiceImp implements IEmployeeService {
	
		@Autowired
		EmployeeRepository repo;
	

	@Override
	public Employee addEmployee(Employee emp) {
		
		return  repo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return repo.save(emp);
	}

	@Override
	public Employee getByEid(int eid) {


		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deleteByEid(int eid) {
		
		
			repo.deleteById(eid);
		
		return "Employee Deleted successfully Eid : "+eid;
  
	}

	@Override
	public List<Employee> getAllEmployees() {


		return repo.findAll();
	}

	@Override
	public Employee findByEname(String ename) {


		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> findBySalaryGreaterThan(double sal) {


		return  repo.findBySalaryGreaterThan(sal);
	}

	@Override
	public List<Employee> getAllEmployeesSortedBySalary() {


		//return repo.findAll(Sort.by("salary"));
			
		return repo.findAll(Sort.by(Direction.DESC, "salary"));
	}

	@Override
	public List<Employee> findBySalaryRange(double min, double max) {


		return  repo.findBySalaryRange(min, max);
	}

	@Override
	public int updateSalary(double salary, int eid) {


		return repo.updateSalary(salary, eid);
	}

	@Override
	public List<Employee> getAllBySQL() {


		return  repo.getAllBySQL();
	}
	
	

}
