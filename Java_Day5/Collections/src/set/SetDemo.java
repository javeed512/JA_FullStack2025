package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {


		
		Set<Integer>  set  = 		new HashSet<Integer>();
		
			set.add(200);
			System.out.println(set.add(40));
			set.add(37);
			set.add(30);
			System.out.println(set.add(40));
			set.add(null);
			
			System.out.println(set);
		
				Iterator<Integer>  it = set.iterator();
				
				while(it.hasNext()) {
					
				Integer i =	it.next();
				System.out.println(i);
					
				}
			

	}

}
