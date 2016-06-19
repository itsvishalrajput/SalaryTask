<%@page import="java.util.ArrayList"%>
<%@page import="com.rajput.apps.GetValues"%>
<%@page import="com.rajput.apps.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Finder</title>
</head>
<body>
<form action="index.jsp" method="get">
	Salary ::<input type="text" placeholder="Type Salary to Search" name="salary">
	<input type="submit" value="Search">
</form>
<% String salary = request.getParameter("salary"); 
	if(salary!=null){ 
%>
<table border="1">
	<tr>
		<td>Employee ID</td>
		<td>Employee Name</td>
		<td>Contact No.</td>
		<td>Salary</td>
	</tr>
<% 
	GetValues data = new GetValues();
	//EmployeeDetails details = new EmployeeDetails();
	ArrayList<EmployeeDetails> list = new ArrayList<>();
	list = data.getDetails(salary);
	//for(int i=0;i<list.size();i++){
	for(EmployeeDetails details : list) {
            
%>
	<tr>
		<td><%= details.getEmployeeID() %></td>
		<td><%= details.getEmployeeName() %></td>
		<td><%= details.getContactNo() %></td>
		<td><%= details.getEmployeeSalary() %></td>
	</tr>
<% }
%>
</table>
<%} %>
</body>
</html>