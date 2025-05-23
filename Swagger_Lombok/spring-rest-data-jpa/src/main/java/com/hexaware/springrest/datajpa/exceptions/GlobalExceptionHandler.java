package com.hexaware.springrest.datajpa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({EmployeeNotFoundException.class })
	//@ResponseStatus(reason="Employee Not Found",code = HttpStatus.NOT_FOUND)
	 public  ResponseEntity<String>  handleExp(Exception e) {
		 
		 return new ResponseEntity<String>("Employee Not Found" , HttpStatus.NOT_ACCEPTABLE);
		 
	 }

}
