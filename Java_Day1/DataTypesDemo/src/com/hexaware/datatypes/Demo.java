package com.hexaware.datatypes;

public class Demo {

	public static void main(String[] args) {


		byte  b =  50; // 1BYTE OR 8-BITS 
		
		int x = b;
		
		int  i = 130;
		
		long  l =(long)  50000;  // implicit type casting
		
		long  mno =  998877665599992399L;

		
		char  c = 'A';
		
		System.out.println("byte value "+ b);
		
		System.out.println("int value "+i);
		
		System.out.println("long value "+l);
		
		System.out.println("char "+ c);
		
		byte  b1 = (byte) i;  // explicit type casting
				
			System.out.println("b1 value "+b1);
			
	    double d  =  4.0000000000000123;		
		
	    float f = (float) 2.999;
	    
	    float f1 = 3.123456789012345f;
	    
	    System.out.println("d value "+d);
	    
	    System.out.println("f1 value "+f1);
	    
	    float  f2 = mno;
	    System.out.println("f2 "+f2);
		
	}

}
