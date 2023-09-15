<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table boarder="5">
<tr>
<th>Employee id</th>
<th>Employee ename></th>
<th>edit action </th>
<th>delete action</th>
</tr>
<c:forEach var ="empList" items="${empList}">
<tr>
<td>${empList.eid}</td>
<td>${empList.ename}</td>
<td><a href="editEmployee/${empList.eid}">Click here to edit</a></td>
<td><a href="deleteEmployee/${empList.eid}">Click here to delete</a></td>
</tr>
</c:forEach>
</table>-
</body>
</html>