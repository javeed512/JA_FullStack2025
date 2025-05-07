package com.atm.ui;

import java.util.Scanner;

import com.atm.service.IBank;
/*
 * @Author: Karthik  (UI Developer)
 * Desp: Developing U
 */

public class AtmUI { // USER INTERFACE

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			IBank b =	Util.getObject();  // abstraction

		boolean flag = true;
		
		while(flag)
		{
		
		System.out.println("****WELCOME TO ATM****");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Exit");

		int choice = sc.nextInt(); // "1" --> 1

		switch (choice) {
		case 1:
					// deposit
			
						b.deposit();
			break;
		case 2:
					// withdraw
			
						b.withdraw();
			break;

		case 3:
					// exit
			
			 		flag = false;
			 		
			 		System.out.println("Thank you , visit again..");
			 		
			break;

		default:
			
					System.err.println("Invalid Option");
			break;
		}
		
		}

	}

}
