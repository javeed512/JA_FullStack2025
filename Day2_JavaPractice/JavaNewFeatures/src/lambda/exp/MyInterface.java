package lambda.exp;

@FunctionalInterface  //optional
public interface MyInterface {  // Function functional interface
	
	
 public abstract	 int  add(int a, int b);
 
 	public static void m1() {
 		
 		System.out.println("it is static method in interface");
 	}
 
 	
   public default void m2() {
 		
 		System.out.println("it is default method in interface");
 	}
 
 
}
