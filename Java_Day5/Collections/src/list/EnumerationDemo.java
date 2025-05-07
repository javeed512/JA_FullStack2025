package list;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {

		Vector<Integer> list2 = new Vector<Integer>(6);
		// it is legacy class synchronized or thread safe
		list2.add(10);
		list2.add(15);
		list2.add(20);
		list2.add(25);
		list2.add(30);
		
			Enumeration<Integer>  en =	list2.elements();
			
			  while (en.hasMoreElements()) {
				Integer i = en.nextElement();
				System.out.println(i);
				
			}
				

	}

}
