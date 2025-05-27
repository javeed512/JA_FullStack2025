package com.hexaware.springtools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springtools.entity.Student;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {

	
		@PostMapping("/add")
		public   Student   addStudent(@RequestBody  Student student) {
			
			
			student.setSname("MR. "+student.getSname());
			
			return student;
			
		}
		
		
		@GetMapping("/hello")
		public  String  hello() {
			
			
			return "Hello Friends , once again";
			
		}
	
	
	
	
}
