package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LHSDemo {

	public static void main(String[] args) {
		Set<Integer>  set  = 		new LinkedHashSet<Integer>();
		
		set.add(200);
		System.out.println(set.add(40));
		set.add(37);
		set.add(30);
		System.out.println(set.add(40));
		set.add(null);
		
		System.out.println(set);
	}

}
