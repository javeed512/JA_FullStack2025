package com.hexaware.steps;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {
	
	public static void main(String[] args) {
		
	
	
	Connection conn = null;

	try {
		// step1
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		// step2
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "admin");

		// step3

		Statement stmt = conn.createStatement();
		
			String query = "select * from Emp";  // static query or DDL are static 

					// Note: if you want to execute DDL query then call  execute();
			
			ResultSet  rs =	stmt.executeQuery(query);
				
			
			  while(rs.next()) {
				  
				  
			int eid =	  rs.getInt("eid");
			String  ename =  rs.getString("ename");
			double  salary = rs.getDouble("salary");
			Date   doj = rs.getDate("doj");
			
				  
			System.out.println(eid +" "+ename+" "+salary+"  "+doj);
			
			
			  }
			
			

	} catch (SQLException e) {

		e.printStackTrace();
	} finally {

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
	
	

}
