package com.rajput.apps;

public class EmployeeDetails {
	private int EmployeeID;
	private String EmployeeName;
	private String ContactNo;
	private String EmployeeSalary;
	
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public String getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", ContactNo="
				+ ContactNo + ", EmployeeSalary=" + EmployeeSalary + "]";
	}
	
}
