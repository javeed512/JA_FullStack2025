package com.hexaware.springrest.datajpa.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrest.datajpa.entity.Employee;

@SpringBootTest
class EmployeeRestControllerTest {
	
	@Autowired
	RestTemplate  restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testGetAll() {
		
	}
	
	@Test
	void testGetById() {
		
		
		int eid = 101;
		
	Employee emp =   restTemplate.getForObject("http://localhost:8080/api/employees/getbyid/"+eid, Employee.class);
		
		assertEquals(101, emp.getEid());
	
	}

	@Test
	@Disabled
	void testAddEmp() {
		
		Employee emp = new Employee(111, "rajendar", 30000);
		
		ResponseEntity<Employee>  response =	restTemplate.postForEntity("http://localhost:8080/api/employees/add", emp ,Employee.class );
	
		Employee  e1 =		response.getBody();
		
			HttpStatusCode  code =				response.getStatusCode();
			
			 System.out.println(code);
		
			assertNotNull(e1);
		
		
	}

	@Test
	void testUpdateEmp() {
		 
		Employee emp = new Employee(111, "rajendar kumar", 80000);
		
		
		   restTemplate.put("http://localhost:8080/api/employees/update", emp);
		
		
	}

	@Test
	void testDeleteEmp() {
		
		int eid = 108;
		
				restTemplate.delete("http://localhost:8080/api/employees/delete/"+eid);
		
	}

}
