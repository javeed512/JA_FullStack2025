package com.hexaware.ems.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.exceptions.EmployeeNotFoundException;


public class EmployeeDaoImp implements IEmployeeDao {

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
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(int eid) {

		int count = 0;

		try {
			Connection conn = DBUtil.getDBConnection();

			String delete = "delete from Emp  where eid = ?";

			PreparedStatement pstmt = conn.prepareStatement(delete);

			pstmt.setInt(1, eid);

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

	@Override
	public List<Employee> getBySalaryGT(double sal) {


		return null;
	}

	@Override
	public Employee getByEid(int eid) throws EmployeeNotFoundException {

		Employee emp = null;

		try {
			Connection conn = DBUtil.getDBConnection();

			String select = "select * from Emp where eid = ?";

			PreparedStatement pstmt = conn.prepareStatement(select);
			
					pstmt.setInt(1, eid);

			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {

				int eid1 = rs.getInt("eid");
				double salary = rs.getDouble("salary");
				String ename = rs.getString("ename");
				Date doj = rs.getDate(4); // using column number in table ie. 4

				emp = new Employee(eid1, ename, salary, doj);

			

			}
			
			else {
				
				
				throw  new EmployeeNotFoundException();
				
				
			}
			  
			  
			  
			

		}
		catch (SQLException e) {

				e.printStackTrace();
		}
		
		
		
		return emp;
	}

}
