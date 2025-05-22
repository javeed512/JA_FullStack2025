package com.hexaware.springboot.exceptionhandling.exp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	
	@ExceptionHandler(ArithmeticException.class)
	public   ResponseEntity<String>   handleExp() {
		
		
		return  new ResponseEntity<String>("Sorry , Can't Div Number by Zero from Global Exp Handler",HttpStatus.BAD_REQUEST);
		
		
	}
	
	
	  @ExceptionHandler(NullPointerException.class) 
	  @ResponseStatus(reason ="Null Pointer Exception is Handle",value=HttpStatus.BAD_REQUEST)
	  public void handleNPExp(NullPointerException ne) {
	  
		   
	  
	  }
	

}
