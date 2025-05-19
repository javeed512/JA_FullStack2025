package com.hexaware.springmvc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBUtil { // Factory class
	
	
		public  static  Connection   getDBConnection() throws SQLException {// Factory method
			
			
			
			
			Connection conn =	  DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","admin");
				
				return conn;
			
			
		}
	
}

