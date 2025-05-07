package list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {


		List<Integer>  list2  = new LinkedList<Integer>();

		//List<Integer>  list2  = new Vector<Integer>(6);
							// it is legacy class synchronized or thread safe
		list2.add(10);
		list2.add(15);
		list2.add(20);
		list2.add(25);
		list2.add(30);
		
		
			ListIterator<Integer>  lit  =		list2.listIterator();
			
			
			
				
					lit.next();
					lit.next();
					lit.next();
					
				while(lit.hasPrevious()) {
					
				Integer i =	lit.previous();
				
					System.out.println(i);
				
					}
			
				

	}

}
