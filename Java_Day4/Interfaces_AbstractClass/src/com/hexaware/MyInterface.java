package com.hexaware;

// Functional interface
public interface MyInterface extends InterfaceOne , InterfaceTwo {

	public  abstract  int show(String name);
	
	
	
	public static  void m1() {
		
		System.out.println("static method from interface");
	}
	
	public default void m2() {
		
		System.out.println("default method from interface");
		
	}
	
	
}
