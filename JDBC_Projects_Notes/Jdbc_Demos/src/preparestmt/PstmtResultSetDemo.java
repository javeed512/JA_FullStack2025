package preparestmt;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.steps.DBUtil;

public class PstmtResultSetDemo {

	public static void main(String[] args) {  // front end code or presentation layer

		List<Employee> list = getAllEmployees();

		for (Employee employee : list) {

			System.out.println(employee);

		}

	}

	public static List<Employee> getAllEmployees() {  // backend code

		List<Employee> list = new ArrayList<Employee>();

		try {
			Connection conn = DBUtil.getDBConnection();

			String select = "select * from Emp  where salary > ?";

			PreparedStatement pstmt = conn.prepareStatement(select);

			pstmt.setDouble(1, 70000);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int eid = rs.getInt("eid");
				double salary = rs.getDouble("salary");
				String ename = rs.getString("ename");
				Date doj = rs.getDate(4); // using column number in table ie. 4

				Employee emp = new Employee(eid, ename, salary, doj);

				list.add(emp);

			}

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

}
