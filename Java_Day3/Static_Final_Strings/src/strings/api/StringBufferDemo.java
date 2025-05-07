package strings.api;

public class StringBufferDemo {

	public static void main(String[] args) {


		StringBuffer sb1 = new StringBuffer("hello");
		
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("world");
		
		System.out.println(sb2);
			
			sb1.append(sb2); // modfication
			
			System.out.println(sb1);
			
			sb2.reverse();
			System.out.println(sb2);
			
			sb1.replace(0, 5, "javed");
			
			System.out.println(sb1);
		
	}

}
