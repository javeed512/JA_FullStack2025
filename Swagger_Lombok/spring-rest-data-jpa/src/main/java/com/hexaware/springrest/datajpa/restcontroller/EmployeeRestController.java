package com.hexaware.springrest.datajpa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.exceptions.EmployeeNotFoundException;
import com.hexaware.springrest.datajpa.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	
	
		@Autowired
		IEmployeeService service;
	
	
	  		@GetMapping("/getall")
			public List<Employee>   getAll() {
				
	  		
	  			log.info("this is info");
	  			log.warn("this is warning");
	  			log.error("this is error");
	  		
	  			
				return service.getAllEmployees();
				
			}
	
	  		
	  		@GetMapping(value="/getbyid/{eid}",produces = "application/json")
	  		public Employee  getById(@PathVariable   int eid ) throws EmployeeNotFoundException {
	  			
	  			
	  		  Employee emp = service.getByEid(eid);
	  		  
	  		  if(emp == null) {
	  			  
	  			  throw  new EmployeeNotFoundException();
	  			  
	  		  }
	  		  
	  		  return emp;
	  			
	  		}
	  		
	  		
	  		
	  		// @RequestMapping(value="/add",method=RequestMethod.POST)
	  		
	  		@PostMapping(value="/add",consumes = "application/json")
	  		public  Employee  addEmp(@RequestBody  Employee emp) {
	  			
	  			
	  			
	  			  return service.addEmployee(emp);
	  			
	  		} 
	
	  		
	  		@PutMapping(value="/update",consumes = "application/json",produces="application/json")
	  		public  Employee  updateEmp(@RequestBody  Employee emp) {
	  			
	  			  return service.updateEmployee(emp);
	  			
	  		} 
	
	  		//http://localhost:8080/api/employees/delete/101 --> here 101 is path variable value
	  		
	  		@DeleteMapping("/delete/{eid}")
	  		public  String  deleteEmp(@PathVariable  int eid) {
	  			
	  			 return  service.deleteByEid(eid);
	  			
	  		}
	  		
	  		@GetMapping("/getbyename/{ename}")
	  		public   Employee   getByEname(@PathVariable String ename) {
	  			
	  			  return service.findByEname(ename);
	  			
	  		}
	  		
	  		
	  		@GetMapping("/getsalarygt/{sal}")
			public List<Employee>   getBySalaryGT(@PathVariable double sal) {
				
				return service.findBySalaryGreaterThan(sal);
				
			}
	  		
	  		@GetMapping("/getallsorted")
	  		public List<Employee> getAllEmployeesSortedBySalary(){
	  			
	  			return service.getAllEmployeesSortedBySalary();
	  			
	  		}
	  		
	  		
	  		@GetMapping("/getbysalaryrange/{min}/{max}")
	  		public List<Employee> getBySalaryRange(@PathVariable double min , @PathVariable double max){
	  			
	  			return service.findBySalaryRange(min, max);
	  			
	  		}
	  		
	  		@PutMapping("/updatesalary/{salary}/{eid}")
	  		public ResponseEntity<String>   updateSalary(@PathVariable double salary , @PathVariable int eid) {
	  			
	  			int count =  service.updateSalary(salary, eid);
	  			
	  			if(count > 0) {
	  			return  new ResponseEntity<String>("Record updated successfully ", HttpStatus.ACCEPTED);
	  			}
	  			
	  			return new ResponseEntity<String>("update failed",HttpStatus.BAD_REQUEST);
	  			
	  		}
	  		
	  		@GetMapping("/getallbysql")
	  		public  List<Employee>  getAllBySQL(){
	  			
	  			return service.getAllBySQL();
	  			
	  		}
	  		
	  		
	

}
