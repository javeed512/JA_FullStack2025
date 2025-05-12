package preparestmt;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hexaware.steps.DBUtil;

public class PStmtDemo {

	public static void main(String[] args) {

		try {

			Connection conn = DBUtil.getDBConnection();

			// ? positional parameters which will passed at runtime

			// code for insert
			/*
			 * String insertQuery =
			 * "insert into Emp(eid,ename,salary,doj)  values(?,?,?,current_date)";
			 * 
			 * PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			 * 
			 * pstmt.setInt(1, 107); pstmt.setString(2, "Ravi"); pstmt.setDouble(3, 50000);
			 * // pstmt.setDate(4, new Date(2025, 4, 10));
			 */

			// update code
			/*
			 * String updateQuery = "update Emp set ename =? , salary = ? where eid = ?";
			 * PreparedStatement pstmt = conn.prepareStatement(updateQuery);
			 * 
			 * pstmt.setString(1, "Ravi Kumar"); pstmt.setDouble(2, 80000); pstmt.setInt(3,
			 * 107);
			 */

			// code for delete

			String deleteQuery = "delete from Emp where eid = ?";

			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, 106);

			int count = pstmt.executeUpdate();
			System.out.println(count + " record effected");

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
