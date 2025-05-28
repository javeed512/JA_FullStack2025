package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.login())")
	public void authentication() { // pointcut-1
		
		
	}

	@Pointcut("execution(* com.hexaware.aop.service.BankService.deposit())")
	public void authorization() {  // pointcut-2

		
		
	}
	
	
	@Before("authentication() ")
	public void   authenticationJP() { // join point
		
		System.out.println("User Login verified with authentication ");
		
	}
	
	@Before(" authorization()")
	public void  authorizationJP() {
		
		System.out.println("Authorization done and Bank Service executed .....");
		
	}
	
	
	
	/*
	 * @Before("authentication() || authorization()  ") public void
	 * authenticationAuthorizationJP() { // join point
	 * 
	 * System.out.println("User Login verified with authentication ");
	 * 
	 * }
	 */
	
	
	

}
