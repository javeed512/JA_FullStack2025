package com.hexaware.springdatajpa.mappings.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aid")  // f.k column name from developer
	private Address address;

	public Student() {
		super();
	}

	
	
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}




	public Student(int studentId, String studentName, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
