<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register.do" method="post">
Name : <input type="text" name="name"><br><br>
Address : <input type="text" name="address"><br><br>
Course :<select name="course">
<option value="Btech">Btech</option>
<option value="BCA">BCA</option>
<option value="BBA">BBA</option>
<option value="Bcom">Bcom</option>
<option value="B.sc">B.sc</option>
</select><br><br>
Place : <input type="text" name="placde"><br><br>
Age : <input type="number" name="age"><br><br>
<input type="submit" value="Register">
</form>
</body>
</html>