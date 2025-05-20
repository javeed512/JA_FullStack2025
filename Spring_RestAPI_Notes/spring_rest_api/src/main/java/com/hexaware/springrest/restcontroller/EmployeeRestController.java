package com.hexaware.springrest.restcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.entity.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	
	  		@GetMapping("/getall")
			public String   getAll() {
				
				return "All Employees Records will be return";
				
			}
	
	  		
	  		@GetMapping("/getbyid/{eid}")
	  		public String  getById(@PathVariable   int eid ) {
	  			
	  			return "Employee added successfully with Eid : "+eid;
	  			
	  		}
	  		
	  		
	  		
	  		// @RequestMapping(value="/add",method=RequestMethod.POST)
	  		
	  		@PostMapping("/add")
	  		public  Employee  addEmp(@RequestBody  Employee emp) {
	  			
	  			return emp;
	  			
	  		} 
	
	  		
	  		@PutMapping("/update")
	  		public  Employee  updateEmp(@RequestBody  Employee emp) {
	  			
	  			return emp;
	  			
	  		} 
	
	  		//http://localhost:8080/api/employees/delete/101 --> here 101 is path variable value
	  		
	  		@DeleteMapping("/delete/{eid}")
	  		public  String  deleteEmp(@PathVariable  int eid) {
	  			
	  			  return   "Record deleted for Eid : "+eid;
	  			
	  		}
	  		
	  		
	  		
	

}
