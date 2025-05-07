package compiletime;

public class Test {

	public static void main(String[] args) {

				

		Employee e1 = new Employee();
		
		System.out.println(e1);  // e1.toString()
		
		Object o = new Object();
		
		Employee e = new Employee();
		
		Object o1  = (Object)  new Employee(); // Runtime Polymorphism
						// Auto Boxing will be done by compiler

		//	Employee e2 = new Object(); // invalid
		 
		Employee  e2 =  (Employee) o1; // unboxing or explicit type casting
		
	}

}
