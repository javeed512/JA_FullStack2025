package strings.api;

public class StringDemo {

	public static void main(String[] args) {

			
		String s1 = "hello";
		
		String s2 = "hello"; 
		
		
		String  s3 = new String("hello");
		
		String  s4 = new String("hello");
		
		System.out.println(s1); // s1.toString(); from String class
		
		System.out.println("comparing value "+s3.equals(s4));
		
		System.out.println("comparing hashcode "+ (s3 == s4) );
		
		System.out.println("comparing hashcode "+ (s1 == s2) );
		
		
		

	}

}
