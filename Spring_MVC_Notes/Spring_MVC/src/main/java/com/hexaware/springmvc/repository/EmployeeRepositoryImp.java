package com.hexaware.springmvc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hexaware.springmvc.entity.Employee;

@Repository
public class EmployeeRepositoryImp implements IEmployeeRepository {

	@Override
	public int addEmployee(Employee emp) {
		int count = 0;

		try {
			Connection conn = DBUtil.getDBConnection();

			String insert = "insert into Emp values(?,?,?,current_date)";

			PreparedStatement pstmt = conn.prepareStatement(insert);

			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setDouble(3, emp.getSalary());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public List<Employee> getAllEmployees() {

		
		List<Employee> list = new ArrayList<Employee>();

		try {
			Connection conn = DBUtil.getDBConnection();

			String select = "select * from Emp";

			PreparedStatement pstmt = conn.prepareStatement(select);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int eid = rs.getInt("eid");
				double salary = rs.getDouble("salary");
				String ename = rs.getString("ename");
				Date doj = rs.getDate(4); // using column number in table ie. 4

				Employee emp = new Employee(eid, ename, salary, doj);

				list.add(emp);

			}

		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
		
		

	}

}
