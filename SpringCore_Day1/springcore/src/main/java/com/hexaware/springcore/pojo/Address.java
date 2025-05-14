package com.hexaware.springcore.pojo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component("a1")
public class Address {
	
	private String city;	
	public Address() {
		
		System.out.println("Address() obj created...");
		
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
