package com.hexaware.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hexaware.springmvc.entity.Employee;
import com.hexaware.springmvc.service.IEmployeeService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@RequestMapping("/employees")
@Controller
public class EmployeeController {
	
	
	@Autowired
	IEmployeeService service;
	
	
		@RequestMapping(value="/add",method=RequestMethod.POST)	
		public  String    addEmp(@ModelAttribute  @Valid Employee  emp , HttpSession session) {
			
					session.setAttribute("emp", emp);
			
				service.addEmployee(emp);	
			
			return    "success";    // return  view or page  /views/success.jsp
			
		}
	
	
		@RequestMapping(value="/getall" , method= RequestMethod.GET)
		public String  displayAll(HttpSession session) {
			
		List<Employee>  list =		service.getAllEmployees();
			
			session.setAttribute("empList", list);
		
		
			return "displayAll";  // return view   /views/displayAll.jsp
			
		}
		
		
		
		
		
		
		
		
		
	

}
