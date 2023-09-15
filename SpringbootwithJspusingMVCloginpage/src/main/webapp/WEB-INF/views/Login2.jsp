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
<c:if test="${msg!=null}">
<h1>${msg }</h1>
</c:if>
<c:if test="${invalidmsg!=null}"> 
<h1 style="colour:green">${invalidmsg}</h1>
</c:if>
</body>
</html>