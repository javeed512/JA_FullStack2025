package com.hexaware.springrest.datajpa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	
		@Autowired
		IEmployeeService service;
	
	
	  		@GetMapping("/getall")
			public List<Employee>   getAll() {
				
				return service.getAllEmployees();
				
			}
	
	  		
	  		@GetMapping("/getbyid/{eid}")
	  		public Employee  getById(@PathVariable   int eid ) {
	  			
	  			
	  			return service.getByEid(eid);
	  			
	  		}
	  		
	  		
	  		
	  		// @RequestMapping(value="/add",method=RequestMethod.POST)
	  		
	  		@PostMapping("/add")
	  		public  Employee  addEmp(@RequestBody  Employee emp) {
	  			
	  			  return service.addEmployee(emp);
	  			
	  		} 
	
	  		
	  		@PutMapping("/update")
	  		public  Employee  updateEmp(@RequestBody  Employee emp) {
	  			
	  			  return service.updateEmployee(emp);
	  			
	  		} 
	
	  		//http://localhost:8080/api/employees/delete/101 --> here 101 is path variable value
	  		
	  		@DeleteMapping("/delete/{eid}")
	  		public  String  deleteEmp(@PathVariable  int eid) {
	  			
	  			 return  service.deleteByEid(eid);
	  			
	  		}
	  		
	  		
	  		
	

}
