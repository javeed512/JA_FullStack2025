package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {

			List<Object> list = 	new ArrayList<Object>();
			
				list.add(new String("tom"));
				list.add(5);// new Integer(5)
				list.add(4.99);
				list.add(22334455);
				
				System.out.println(list);
				
				System.out.println(list.get(0));
				
				
				//List<Integer>  list2  = new ArrayList<Integer>();
				
				//List<Integer>  list2  = new LinkedList<Integer>();

				List<Integer>  list2  = new Vector<Integer>(6);
									// it is legacy class synchronized or thread safe
				list2.add(10);
				list2.add(30);
				list2.add(20);
				list2.add(40);
				list2.add(30);
				list2.add(null);
				list2.add(50);
				System.out.println(list2);
								
			Iterator<Integer> it = list2.iterator(); // cursor it is used to retrieve elements one by one	
			System.out.println("Iterator cursor");
			while(it.hasNext()) {
				
				Integer i =  it.next();
				
				// Object obj = it.next();
			//	Integer  i = (Integer)  obj;  // unboxing or explicit type casting
				 
				System.out.println(i);				
			}	
			
			System.out.println("For Each Loop");
			for(Integer i: list2) {
				
				System.out.println(i);
				
			}
			
			

	}

}
