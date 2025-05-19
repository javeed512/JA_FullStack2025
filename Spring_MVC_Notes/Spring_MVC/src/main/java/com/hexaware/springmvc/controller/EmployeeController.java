package com.hexaware.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hexaware.springmvc.entity.Employee;
import com.hexaware.springmvc.service.IEmployeeService;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/employees")
@Controller
public class EmployeeController {
	
	
	@Autowired
	IEmployeeService service;
	
	
		@RequestMapping(value="/add",method=RequestMethod.POST)	
		public  String    addEmp(@ModelAttribute  Employee  emp , HttpSession session) {
			
					session.setAttribute("emp", emp);
			
				service.addEmployee(emp);	
			
			return    "success";    // return  view or page  /views/success.jsp
			
		}
	
	
	

}
