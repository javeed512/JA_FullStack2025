package com.hexaware.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		Connection conn = null;

		try {
			// step1
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// step2
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "admin");

			// step3

			Statement stmt = conn.createStatement();

			//String query = "insert into Emp values(101,'javeed',70000,'2025-01-19')";
			
			int eid = 101; String name = "tom";
			
	 
			
			String updateQuery = "update Emp set ename = 'javeed khan' , salary = 90000 , doj = '2025-04-10' where eid = 101";

			// step4
			int count = stmt.executeUpdate(updateQuery);

			System.out.println(count + " record effected...");

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
