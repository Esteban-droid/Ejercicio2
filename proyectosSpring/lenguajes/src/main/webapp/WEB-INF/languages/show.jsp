<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Language Info</title>
</head>
<body>
  				<a class="nav-link" href="/languages">Home </a>
    			<br>Language Details

    		<h5><c:out value="${language.name}"/></h5>
    		<p>Creator: <c:out value="${language.creator}"/>
    			<br>Version: <c:out value="${language.version}"/></p>
    		
    		<a href="/languages/${language.id}/edit">Edit</a>

    		<form action="/languages/<c:out value="${language.id}"/>" method="post">
				<input type="hidden" name="_method" value="delete">
    			<input type="submit" class="btn btn-link" value="delete">
    		</form>

</body>
</html>