package com.hexaware.springrest.datajpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrest.datajpa.entity.Employee;

@SpringBootTest
class EmployeeServiceImpTest {
	
	@Autowired
	IEmployeeService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	@Disabled
	void testAddEmployee() {
		
		Employee emp = new Employee(108, "vikas", 40000);
		
	Employee e1 =	service.addEmployee(emp);
	
			assertNotNull(e1);
			
			assertEquals("vikas", e1.getEname());
			
		
		
	}

	@Test
	@DisplayName("TestGetByEid")
	void testGetByEid() {
		
		
		Employee emp =	service.getByEid(101);
		
		  assertTrue(emp.getSalary() > 0);
		
	}

	@Test
	void testGetAllEmployees() {
		
		List<Employee>  list =    service.getAllEmployees();
		
		assertEquals(6	, list.size());
		
		assertEquals("javeed khan", list.get(0).getEname());
		
	}

}
