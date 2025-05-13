package com.hexaware.ems.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.exceptions.EmployeeNotFoundException;
import com.hexaware.ems.service.EmployeeServiceImp;
import com.hexaware.ems.service.IEmployeeService;

class EmployeeServiceImpTest {
	
	static IEmployeeService  service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
			service =	new  EmployeeServiceImp();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	@Disabled
	void testAddEmployee() {
		
		Employee emp = new Employee(106	, "Raja", 20000, null );
		
		
			int count =	service.addEmployee(emp);
			
			assertEquals(1, count);
		
	}

	/*
	 * @Test void testUpdateEmployee() {
	 * 
	 * Employee emp = new Employee(106 , "Raja Rao", 50000, null );
	 * 
	 * service.updateEmployee(emp);
	 * 
	 * 
	 * }
	 */

	@Test
	@Disabled
	void testDeleteEmployee() {
		
		
		int count =	service.deleteEmployee(0);  // eid = 0
		
		assertEquals(1, count);
		
		
	}

	
	@Test
	void testGetAllEmployees() {
		
			List<Employee>  list =	service.getAllEmployees();
			
			assertTrue(list.size() > 0);
			
			assertNotNull(list);
			
			assertEquals(101, list.get(0).getEid());
			
			System.out.println(list);
		
		
	}
	
	
	
	@Test
	void testGetByEid() {
		
		
				try {
			Employee e1 =		service.getByEid(101);
			
					
			assertNotNull(e1);
			
			assertEquals(90000.0, e1.getSalary());
			
			System.out.println(e1);
			
			
				} catch (EmployeeNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		
	}

}
