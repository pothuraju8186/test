<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="/updateEmployee" method="post">
enter your employee id <input type="text" name ="eid"value="${emp.eid}"><br>
enter your employee name <input type="text" name ="ename"value="${emp.ename}"><br>
<input type="submit" value="submit">
</form>
</body>
</html>