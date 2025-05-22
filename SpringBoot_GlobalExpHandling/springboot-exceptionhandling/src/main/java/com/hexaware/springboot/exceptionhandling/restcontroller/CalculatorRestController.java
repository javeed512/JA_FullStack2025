package com.hexaware.springboot.exceptionhandling.restcontroller;

import com.hexaware.springboot.exceptionhandling.SpringbootExceptionhandlingApplication;
import com.hexaware.springboot.exceptionhandling.exp.CustomException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calsi")
public class CalculatorRestController {

    private final SpringbootExceptionhandlingApplication springbootExceptionhandlingApplication;


    CalculatorRestController(SpringbootExceptionhandlingApplication springbootExceptionhandlingApplication) {
        this.springbootExceptionhandlingApplication = springbootExceptionhandlingApplication;
    }
	
	
		@GetMapping("/div/{n1}/{n2}")
		public int   div(@PathVariable int n1 , @PathVariable int n2) {
			
			 int  result =  n1/n2;
			 
			 
			 return result;
			 
			
		}
		
		
		@GetMapping("/hello")
		public String  sayHello() {
			
				String name = null  ;
			
			
			
			  
			  return  "Hello "+name.toUpperCase();
			
		}
		
		@GetMapping("/test/{name}")
		public  String   test(@PathVariable String name)throws CustomException {
			
			
				if(name.length() < 4) {
					
					
					
					throw  new  CustomException();
					
				}
			
			 return  name;
			
		}
		
		
		
		
		/*
		 * @ExceptionHandler(ArithmeticException.class) public ResponseEntity<String>
		 * handleExp() {
		 * 
		 * 
		 * return new
		 * ResponseEntity<String>("Sorry , Can't Div Number by Zero",HttpStatus.
		 * BAD_REQUEST);
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * @ExceptionHandler(NullPointerException.class)
		 * 
		 * @ResponseStatus(reason =
		 * "Exception occur due to null value in object",value=HttpStatus.BAD_REQUEST)
		 * public void handleNPExp() {
		 * 
		 * 
		 * 
		 * }
		 */
		
		
		
		
		
		
		
	
	

}
