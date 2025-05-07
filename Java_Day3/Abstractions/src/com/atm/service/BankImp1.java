package com.atm.service;

/*
 * @Author: Devi
 * Descp:  deposit() implementation
 * 
 */

public abstract class BankImp1  implements IBank {

	@Override
	public void deposit() { // concrete method
								// 50% implementation
		
		System.out.println("Deposit successful...");  // business logic
		
	}
	
	
	public abstract  void withdraw();



}
