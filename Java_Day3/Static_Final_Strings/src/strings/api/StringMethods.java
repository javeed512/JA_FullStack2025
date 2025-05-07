package strings.api;

public class StringMethods {

	public static void main(String[] args) {
		
		String  s1 = "hello world";
		
		String  str1 = "java";
		String str2 = "JAVA";
		
		System.out.println("length() "+s1.length());
		
		System.out.println("indexOf() "+ s1.indexOf('l'));
		
		System.out.println("concat() "+ s1.concat(" once again"));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(s1.endsWith("d"));
		
		System.out.println(s1.startsWith("h"));
		
		System.out.println("A".compareTo("B")); // 65 -  66  = -1
		
		
		System.out.println("Bill".compareTo("Adam")); // 1 
					// when compareTo() returns +ve number
				 //swapping of string take place for ordering
		
		String s3 = "hello";
		
		s3 = s3 + " world";  // s3.concat("world");
		
		 s3 = s3 + " again";
		
		
		
	}

}
