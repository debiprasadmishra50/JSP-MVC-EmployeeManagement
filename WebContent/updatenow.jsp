<%@page import="com.model.EmployeeDao"%>
<%@page import="com.db.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:useBean id="e" class="com.db.Employee"></jsp:useBean>
    <jsp:setProperty property="*" name="e"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		
		int status = EmployeeDao.doUpdateNowRecord(e);
		if(status > 0)
			response.sendRedirect("viewUsers.jsp");
		
	%>
</body>
</html>