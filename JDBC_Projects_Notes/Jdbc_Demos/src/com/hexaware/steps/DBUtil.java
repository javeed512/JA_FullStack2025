package com.hexaware.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil { // Factory class
	
	
		public  static  Connection   getDBConnection() throws SQLException {// Factory method
			
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());	
			
			Connection conn =	  DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","admin");
				
				return conn;
			
			
		}
	

}
