package com.hexaware.ems.presentation;

import java.util.List;
import java.util.Scanner;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.exceptions.EmployeeNotFoundException;
import com.hexaware.ems.service.EmployeeServiceImp;
import com.hexaware.ems.service.IEmployeeService;
/*
 * @author: Javeed
 * Date: 11/04/2025
 * Description: This UI calling services
 * 
 * 
 */
public class ClientUI {

	static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		IEmployeeService service =  new EmployeeServiceImp();

		boolean flag = true;

		while (flag) {

			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. UPDATE EMPLOYEE");
			System.out.println("3. DELETE EMPLOYEE BY EID");
			System.out.println("4. DISPLAY ALL EMPLOYEES");
			System.out.println("5. DISPLAY ALL EMPLOYEES BY SALARY GT");
			System.out.println("6. Search By Eid");
			System.out.println("0. EXIT");

			int choice = sc.nextInt();
			
			int count = 0;

			switch (choice) {
			case 1:
				
					Employee e1 =  readData();
					

			boolean flag1 =		EmployeeServiceImp.validateData(e1)	; 
					
			if(flag1) {
					
					 count =	service.addEmployee(e1);
						
					System.out.println(count +" record inserted successfully...");
					
			}
			else {
				
				
				System.err.println("Invalid Input Data");
			}
					
					
				break;
				
			case 2:
				  // service.updateEmployee(e1);
						
				break;
			
			case 3:
				
					System.out.println("Enter Eid to Delete Record");
				  int empId =	sc.nextInt();
				
			 count =	service.deleteEmployee(empId);
			 
			 	System.out.println(count +" record deleted successfully..");
				
				
				break;
				
				
			case 4: 
				
				
					List<Employee>  list =		service.getAllEmployees();
				
				
						for (Employee employee : list) {
							
							System.out.println(employee);
						}
					
				
				break;
				
			case 5:
				
					//service.getBySalaryGT(sal);
				
				break;
				
			case 6:
				
				System.out.println("Enter Eid to Search Record");
				  int eid1 =	sc.nextInt();
				
				
				Employee emp = null;
				
				
				
				try {
					emp = service.getByEid(eid1);
				} catch (EmployeeNotFoundException e) {
					
					
					System.err.println("Sorry Employee Not Found with Eid "+eid1);
					
				}
					
				if(emp != null) {
				System.out.println(emp);
				}
				
				break;
				
				
			case 0:
				
					flag = false;
					
					System.out.println("Thank you , Visit Again..");
				
				break;

			default:
				break;
			}

		}

	}

	public static Employee readData() { // insert , update purpose

		System.out.println("Enter Eid");

		int eid = sc.nextInt();
		
		sc.nextLine();

		System.out.println("Enter EName");

		String ename = sc.nextLine();
		System.out.println("Enter Salary");

		double salary = sc.nextDouble();
		
		Employee employee = new Employee();
			employee.setEid(eid);
			employee.setEname(ename);
			employee.setSalary(salary);
			
			return employee;

	}

}
