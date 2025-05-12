package callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.hexaware.steps.DBUtil;

public class CallableStmtDemo {

	public static void main(String[] args) {

		try {
			Connection conn =	DBUtil.getDBConnection();
			
			// here we can call/execute stored procedure like plsql functions/procedure
			CallableStatement cstmt =  conn.prepareCall("{call  Emp_Pro(?,?)}");
			
					cstmt.setInt(1, 10);
					cstmt.registerOutParameter(2, Types.DOUBLE);
					
					cstmt.execute();
					
				double sumOfSalary =	cstmt.getDouble(2);
				
				System.out.println("Sum of salary from emp_pro "+sumOfSalary);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
