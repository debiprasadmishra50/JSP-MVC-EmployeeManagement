<%@page import="com.model.EmployeeDao"%>
<%@page import="com.db.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="2">
		<tr>
			<th>Empid </th>
			<th>Ename </th>
			<th>Salary </th>
			<th>Email </th>
			<th>Phone </th>
			<th>Edit </th>	
			<th>Remove </th>				
		</tr>
	<%
		ArrayList<Employee> allEmployees = EmployeeDao.getAllRecords();
		for(Employee e : allEmployees)
		{
	%>
			<tr>
				<td> <%=e.getEid() %> </td>
				<td> <%=e.getEname() %> </td>
				<td> <%=e.getSalary() %> </td>
				<td> <%=e.getEmail() %> </td>
				<td> <%=e.getPhone() %> </td>
				<td> <a href="updateemployee.jsp?eid=<%=e.getEid()%>">Modify </a> </td>
				<td> <a href="deleteemployee.jsp?eid=<%=e.getEid()%>">Remove </a> </td>
			</tr>
	<%	
		}
	%>
	</table>
</body>
</html>
