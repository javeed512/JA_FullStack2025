package com.hexaware.springcore.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepoImp implements  IEmployeeRepo{

	@Override
	public void repo() {

			System.out.println("repo() is called from Repository");
		
	}

}
