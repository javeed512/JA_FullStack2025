package com.hexaware.spring.demo;

import org.springframework.stereotype.Component;

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
