package com.hexaware;

public class Test {

	public static void main(String[] args) {


		MyInterface.m1(); // static method
		
		// implementation to the abstract method using lambda exp
		MyInterface mi =	(String name)->{ return name.length(); };

		
			int len =	mi.show("javeed");
			System.out.println("length "+len);
			
			mi.m2(); // default method
	}

}
