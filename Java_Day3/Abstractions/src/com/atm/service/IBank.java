package com.atm.service;

/*
 * @Author: Javeed  (Team Lead)
 * Date:  07-Apr-2025
 * Desp: Bank Interface
 */

public interface IBank {  // open for public all
	
	public static final 	String IFSC ="HDFC1234";
	
	 public abstract  void  deposit();
	 
	 		void withdraw();

}
