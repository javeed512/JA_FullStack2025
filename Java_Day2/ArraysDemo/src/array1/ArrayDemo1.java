package array1;

import java.util.Iterator;

public class ArrayDemo1 {

	public static void main(String   args[]) {


		
				int[]   ar = {10,20,30,40};
				
				System.out.println("array size "+ar.length);
				
				System.out.println("value at index 0 : "+ar[0]);
		
		
					for (int i = 0; i < ar.length; i++) {
						
						System.out.println(ar[i]);
					}
		
					
					System.out.println(ar);
					
					for(int x: ar) {
						
						System.out.println(x);
						
					}
		
	}

}
