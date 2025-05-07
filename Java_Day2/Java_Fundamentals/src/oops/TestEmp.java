package oops;

public class TestEmp {

	public static void main(String[] args) {

// parameter constructor to initialize values to e1 object
		Employee e1  = 	new Employee(101, "king", 50000);
		
		
			
			e1.setSalary(75000.0);// updating e1 salary using setter
		
			// getter methods to read data from e1 object
		System.out.println(e1.getEid() +" "+e1.getEname() +"  "+e1.getSalary());
		
		
		//Employee e2 = new Employee(0, "tom", 0.0);
		
		Employee  e2 = new Employee();
		
			e2.setEname("tom"); // initialize partial value
			
			System.out.println(e2.getEid() +" "+e2.getEname() +"  "+e2
					.getSalary());
			
			
			System.out.println(e1.toString()); // display hashcode
			
			System.out.println(e2.toString());
			
			Employee e3  = 	new Employee(103, "javeed", 30000);
			
				System.out.println(e3);  // e3.toString();
	}

}
