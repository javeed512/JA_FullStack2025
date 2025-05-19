package com.hexaware.springmvc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
