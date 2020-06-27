
<%@page import="com.model.EmployeeDao"%>
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
	int status=EmployeeDao.addNewUser(e); 
	if(status>0)
	{
	
		%>
			<font color="green" size="20">Employee Added sucessfully..</font>
		<%
		}
	else
	{
		%>
			<font color="red" size="20">Error in Registration :)..</font>
		<%
	}
		%>

</body>
</html>