package com.hexaware;

import java.util.Scanner;

public class ReadingData {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first name");
		String fname = sc.nextLine();

		System.out.println("Enter acno ");

		int acno = sc.nextInt();
		
				sc.nextLine(); // to handle enter key

		System.out.println("Enter your city name");
		String city = sc.nextLine();

		System.out.println("Enter amount");

		double amount = sc.nextDouble();

		System.out.println(fname + " " + city + "  " + acno + " " + amount);

	}

}
