package com.rajput.apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetValues {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	ArrayList<EmployeeDetails> empList = new ArrayList<>();
	
	public ArrayList<EmployeeDetails> getDetails(String salary) throws SQLException, ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","root","rajputvishal");
			System.out.println("db connected");
			pstmt = con.prepareStatement("select EmployeeID,EmployeeName,ContactNo,EmployeeSalary from employee_salary.empdetails where EmployeeSalary = ?");
			pstmt.setString(1, salary);
			rs = pstmt.executeQuery();
			while(rs.next()){
				EmployeeDetails details = new EmployeeDetails();
				details.setEmployeeID(rs.getInt("EmployeeID"));
				details.setEmployeeName(rs.getString("EmployeeName"));
				details.setContactNo(rs.getString("ContactNo"));
				details.setEmployeeSalary(rs.getString("EmployeeSalary"));
				empList.add(details);
				System.out.println("Values taken from database");
			}
			if(!(rs.next())){
				EmployeeDetails details = new EmployeeDetails();
				details.setEmployeeID(0);
				details.setEmployeeName(" ");
				details.setContactNo(" ");
				details.setEmployeeSalary(" ");
				empList.add(details);
			}
		}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
		return empList;
	}

}
