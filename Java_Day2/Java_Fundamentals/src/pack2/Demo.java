package pack2;

import oops.Employee;

public class Demo extends Employee {  // static means class level
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		int result =	d.add(4,5);
	
		System.out.println("Result "+result);
		
		System.out.println(sub(10,5));
		
	}
	
	public int add(int a, int b) { // concrete method
		
	int res =	sub(9,3);
		
			System.out.println("Sub Res "+res);
		return a+b;
		
	}

	
	public static int sub(int a, int b) { // static method
		
		
		
		return a - b;
		
	}
	
}
