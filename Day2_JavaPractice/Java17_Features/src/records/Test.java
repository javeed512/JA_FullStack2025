package records;

public class Test {

	public static void main(String[] args) {


		Employee e1 = new Employee(101, "tom", 40000);
		
		System.out.println(e1);
		
		System.out.println(e1.getEname());
		
		
		  e1.setEname("tom cruze");
		  e1.setSalary(50000);
		  
		  System.out.println(e1);
		 
				
				
				  Customer c1 = new Customer(201, "tom", 35000);
				  
				  System.out.println(c1);
				  
				 
				  
				  System.out.println(c1.cname());// just like getCname();
				  System.out.println(c1.amount());
				  
				
				  
				  
				  Customer c2 = new Customer(200, "Hangkong", 35000);
				  
				  System.out.println(c2);
				 
	}

}
