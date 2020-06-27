<%@page import="com.model.EmployeeDao"%>
<%@page import="com.db.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Employee e = new Employee();
		e.setEid(Integer.parseInt(request.getParameter("eid")));
		int status = EmployeeDao.deleteRecord(e);
		if(status > 0)
			response.sendRedirect("viewUsers.jsp");
		
	%>
</body>
</html>