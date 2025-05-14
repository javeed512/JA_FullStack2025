package com.hexaware.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springcore.repository.EmployeeRepoImp;
import com.hexaware.springcore.repository.IEmployeeRepo;

@Service
public class EmployeeServiceImp  implements IEmployeeService {
	
		@Autowired
	  IEmployeeRepo  repo ;

	@Override
	public void service() {

			System.out.println("service() from service class");
			System.out.println("Repo obj in service "+repo);
			repo.repo();

	}

}
