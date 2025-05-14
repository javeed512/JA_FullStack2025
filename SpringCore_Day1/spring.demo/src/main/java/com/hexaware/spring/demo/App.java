package com.hexaware.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan("com.hexaware.spring.demo")
public class App 
{
    public static void main( String[] args )
    {

    		//IOC container
    ApplicationContext  container =	new AnnotationConfigApplicationContext(App.class);
    	
    	
    	Employee emp =		container.getBean(Employee.class);
    	Address  addr =	  container.getBean("a1",Address.class);
    			addr.setCity("Hyd");
    	
    	emp.setEid(101);
    	emp.setEname("king");
    	emp.setEid(9000);
    	emp.setAddress(addr);
    	
    	System.out.println(emp);
    	System.out.println(emp.getAddress());
    	System.out.println(emp.getAddress().getCity());
    	
    	Employee emp2 =		container.getBean(Employee.class);
    	
    	System.out.println(emp2);
    
    }
}
