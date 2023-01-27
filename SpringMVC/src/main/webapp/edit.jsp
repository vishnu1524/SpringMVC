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
<% 
int id=Integer.parseInt(request.getParameter("id"));
StudentDTO fromdb=(StudentDTO)session.getAttribute("student");
%>
<form action="update.do" method="post">
Name : <input type="text" name="uname" value="<%=fromdb.getName()%>"><br><br>
Address : <input type="text" name="uaddress" value="<%=fromdb.getAddress()%>"><br><br>
Course :<select name="course">
<option value="Btech">Btech</option>
<option value="BCA">BCA</option>
<option value="BBA">BBA</option>
<option value="Bcom">Bcom</option>
<option value="B.sc">B.sc</option>
</select><br><br>
Place : <input type="text" name="uplacde"><br><br>
Age : <input type="number" name="uage"><br><br>
<input type="submit" value="Update">
</form>
</body>
</html>