package com.hexaware.springmvc.entity;

import java.sql.Date;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Component
public class Employee {

	@Min(value = 100 , message = "min value must be 100")
	@Max(value = 999 , message= "max value must be 999")
	private int eid;
	
	
	@Pattern(regexp = "[A-Z][a-z]{3,10}" , message = "Name should start with upper case , followed by 3 min and 10 max lower cases")
	private String ename;
	
	@Min(10000)
	@Max(100000)
	private double salary;
	
	//@NotNull
	private  Date  doj;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, double salary, Date doj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.doj = doj;
	}
	
	

	public int getEid() {
		return eid;
	}

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
	
	
	

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "] \n ";
	}

}
