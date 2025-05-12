package preparestmt;

import java.sql.Date;

public class Employee {
	
	private int eid;
	private String ename;
	private double salary;
	private Date doj;
	
	public Employee() {
		
		
	}
	
	
	public Employee(int eid, String ename, double salary, Date doj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.doj = doj;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", doj=" + doj + "]";
	}
	
	
	
	

}
