package com.hexaware.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springcore.pojo.Employee;
import com.hexaware.springcore.service.EmployeeServiceImp;
import com.hexaware.springcore.service.IEmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	
		//IOC container
        ApplicationContext  container =	new AnnotationConfigApplicationContext(SpringConfig.class);
        
        		IEmployeeService  service =	container.getBean(EmployeeServiceImp.class);
        
        			System.out.println(service);
        			
        			service.service();
        			
        		 Employee emp  =  container.getBean(Employee.class);	
        			
        		 	System.out.println(emp);
        		 	System.out.println(emp.getAddress());
    	
    }
}
