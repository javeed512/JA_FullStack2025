package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {


		
			// HashMap =  HashSet , ArrayList
		
	//	Map<Integer,String>  map = new HashMap<Integer,String>();
		
		// Map<Integer,String>  map = new LinkedHashMap<Integer,String>();
		
		Map<Integer,String>  map = new TreeMap<Integer,String>();
		
		map.put(101, "king");
		map.put(104, "javeed");
		map.put(23, "tom");
		map.put(102, "smith");
		map.put(95, "king");
		map.put(102, "khan");
		
		System.out.println(map);
		
				Set<Integer>   set =	map.keySet();
				
				for(Integer k: set) {
					
					System.out.println(k  +"  "+map.get(k));
				}
		

	}

}
