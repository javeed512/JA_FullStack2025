package com.hexaware.springrest.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrest.datajpa.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {

	
	
				// select * from Emp_Table where ename = ?;
			public  Employee	findByEname(String ename);
			
			
			//select * from Emp_table where  salary = ?;
		//	public Employee findBySalary(double salary);
			
			// select * from Emp_Table where salary > ?;
		public  List<Employee>    findBySalaryGreaterThan(double sal);
		
		//JPQL  or HQL
		@Query("select  e  from Employee e where e.salary  between ?1  and  ?2")
		public  List<Employee>  	findBySalaryRange(double min , double max);
			
	
}
