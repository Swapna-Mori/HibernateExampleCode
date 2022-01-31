<%@page import="com.mouritech.employeemanagement.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
</head>
<body>
	<h1>Employee list goes here...............</h1>
	<%
		Object empList = request.getAttribute("listEmp");
		out.println(empList);
	%>
</body>
</html>