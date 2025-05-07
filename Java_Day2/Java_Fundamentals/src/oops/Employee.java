package oops;



public class Employee extends Object{ // Entity class or POJO class
	
	 private  int eid;  // Data Hiding
	 private String ename;  // instance variables or object level variables
	 private double salary;
	 
	 

	 public Employee() {
		 
		 super(); //  Object();
	 }

	 
	 // parameter constructor is used to initialize values to the instance vars
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	
	// getters are used to read data from instance
	public int getEid() {
		return eid;
	}

	
	 // setters are used to initialized instances variables completedly or partially. 
	// It is also used to update instances vars  existing data
	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	 // overriding toString() from Object class
		
		
	
	 
}
