package map;

import java.util.Map;
import java.util.TreeMap;
import set.*;

import set.Employee;

public class EmpHashMap {
	
	public static void main(String[] args) {
		
		
				//Map<Employee,String> map = new HashMap<Employee,String>();
		
		Map<Employee,String> map = new TreeMap<Employee,String>(new MyComparator());
		
				Employee e1 = new Employee(101, "king", 5000);
				Employee e2 = new Employee(103, "smith", 6000);
				Employee e3 = new Employee(104, "ford", 2000);
				Employee e4 = new Employee(105, "javeed", 7000);
				Employee e5 = new Employee(102, "tom", 3000);
			
				
				
						map.put(e1, "Development");
						map.put(e2,"Testing");
						map.put(e3, "Sales");
						map.put(e4, "Marketing");
						map.put(e5, "Training");
						
						
						System.out.println(map);
	}

}
