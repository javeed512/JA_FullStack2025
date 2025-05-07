package compiletime;

public class Employee extends Object{  // Inheritance 
	
	private int eid;
	private String ename;
	private double salary;
	
	@Override
		public String toString() {
			
				return "Employee class toString() is called";
		}
	
	
	public Employee() {
		
		
	}
	// constructor overloading
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	
	public   void  show() {
		
		System.out.println(this.eid);
		System.out.println(this.ename);
		
	}
	// show() method overloading
	public   void  show(boolean flag) {
		
		System.out.println(this.eid);
		System.out.println(this.ename);
		System.out.println(this.salary);
	}
	

}
