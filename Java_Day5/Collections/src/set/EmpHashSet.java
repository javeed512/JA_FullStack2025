package set;

import java.util.HashSet;
import java.util.Set;

public class EmpHashSet {

	public static void main(String[] args) {


		
		Set<Employee>  set  =  new HashSet<Employee>();
		
			Employee e1 = new Employee(101, "king", 5000);
			Employee e2 = new Employee(103, "smith", 6000);
			Employee e3 = new Employee(104, "ford", 2000);
			Employee e4 = new Employee(105, "javeed", 7000);
			Employee e5 = new Employee(102, "tom", 3000);
		
		
		
			set.add(e1);
			set.add(e2);
			set.add(e3);
			set.add(e4);
			set.add(e5);
		
			System.out.println(set);
			
			for (Employee employee : set) {
				
				System.out.println(employee);
				
			}
			
			

	}

}
