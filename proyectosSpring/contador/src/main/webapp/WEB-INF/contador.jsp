<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<h1>You have visited <a href="http://localhost:8080/">http://localhost:8080/</a> <c:out value="${counter}"/> times</h1>
		<a href="/reset">Test another visit?</a> 
	</div>
</body>
</html>