package sorting.searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {


		
		List<Integer>  list2  = new ArrayList<Integer>();
		
		list2.add(70);
		list2.add(10);
		list2.add(30);
		list2.add(20);
		list2.add(40);
		
		
			System.out.println("unsorted "+list2);
		
		
			Collections.sort(list2);
			
			System.out.println("sorted "+list2);
			
			//Collections.reverse(list2);
			
			//System.out.println("Reverse:" + list2);
			
		int  n =	Collections.binarySearch(list2, 70);  // key element is 30
		
			System.out.println("key element found at index "+n);
			
			
			
		List list3 =	Collections.synchronizedList(list2);
			
				// list3 is synchronized or thread safe
			

	}

}
