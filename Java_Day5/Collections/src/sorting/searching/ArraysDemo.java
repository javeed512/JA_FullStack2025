package sorting.searching;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {


			Integer ar[] = {3,2,5,6,1,7,4,};
			
		List<Integer> list = 	Arrays.asList(ar);
		
		System.out.println(list);
		
		
			Arrays.sort(ar);
		
			for (Integer i : ar) {
				
				System.out.println(i);
				
			}
			
		int n =	Arrays.binarySearch(ar, 5);
		
		System.out.println("key element found at index "+n);
		
		
		
			Object[]  ar1 = 	list.toArray();
			
				System.out.println(ar1);
				
				for (Object i : ar1) {
					
					System.out.println(i);
					
				}
		
				
				
				
				

	}

}
