package map;

import java.util.Objects;

public class Employee extends Object {
	
	private int eid;
	private String ename;
	private double salary;

	
	public Employee() {
		
	}


	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(eid);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid;
	}
	
	
	
	
	
	
	
	
	
}
