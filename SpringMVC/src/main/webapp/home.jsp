<%@page import="com.demo.test.DTO.Registrartion.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HOME PAGE</h1><br>
welcome ${ts}
<a href="login.jsp">please login here</a>
<%
StudentDTO fromdb=(StudentDTO)session.getAttribute("student");
int id=fromdb.getId();
%>
<br>
<br>
<a href="edit.jsp?id=<%=id %>">edit your details</a>
</body>
</html>