package com.hexaware.ems.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.hexaware.ems.dao.EmployeeDaoImp;
import com.hexaware.ems.dao.IEmployeeDao;
import com.hexaware.ems.entity.Employee;

class EmployeeDaoImpTest {

	
	static  IEmployeeDao dao;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
			dao = new EmployeeDaoImp();
		
	}

	@Test
	void testAddEmployee() {
		
		Employee e1 = new Employee();
		
		e1.setEid(111);
		e1.setEname("srikanth");
		e1.setSalary(35000);
		
		int n  =	dao.addEmployee(e1);
		
		assertEquals(1, n);
		
		
	}

	@Test
	void testGetAllEmployees() {
		
		
		List<Employee>  list =		dao.getAllEmployees();
		
		 assertNotEquals(null, list);
		
	}

}
