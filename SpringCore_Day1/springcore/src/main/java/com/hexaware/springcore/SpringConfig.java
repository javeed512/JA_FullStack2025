package com.hexaware.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(value = { 
				@ComponentScan("com.hexaware.springcore.pojo") ,
					
				@ComponentScan("com.hexaware.springcore.service"),
				
				@ComponentScan("com.hexaware.springcore.repository")

					})

//@ComponentScan("com.hexaware.springcore.*")
public class SpringConfig {
	
	
	
	
	

}
