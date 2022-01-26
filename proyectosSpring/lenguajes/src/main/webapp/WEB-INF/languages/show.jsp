<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Info</title>
</head>
<body>
  			<a href="/languages">Dashboard</a><br>
  			
    		<h1><c:out value="${language.name}"/></h1>
    		
    		<h1><c:out value="${language.creator}"/></h1>
    		
    		<h1><c:out value="${language.version}"/></h1>
    		
    		<a href="/languages/${language.id}/edit">Edit</a>
    		
    		<br><br>

    		<form action="/languages/<c:out value="${language.id}"/>" method="post">
    			<input type="hidden" name="_method" value="delete">
    			<input type="submit" value="delete">
    		</form>

</body>
</html>