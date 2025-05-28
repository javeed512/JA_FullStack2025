package com.hexaware.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aop.config.AppConfig;
import com.hexaware.aop.service.BankService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	BankService service =		  context.getBean(BankService.class);    	
    	
    	
    				service.login();
    	
    				service.deposit();
    	
    				service.withdraw();
    			try {	
    				
    			double  bal =	service.getBalance(-101);
    			
    	
    	System.out.println("Show balance to customer "+bal);
    	
    			}
    			catch(NullPointerException e) {
    				
    				System.err.println("Account Number is invalid");
    				
    			}
    	
    	
    			/*service.fundTransfer();
    			
    			//service.login();
    	
    			service.withdraw();
    			
    			//service.deposit();
    	
    		double balance =	service.getBalance(101);  
    	
    	
    		
    		System.out.println("Balance  "+balance);
    	*/
    }
}
