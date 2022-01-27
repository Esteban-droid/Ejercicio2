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
	<h1>Info de la canción</h1>
	
	<a href="/dashboard">Dashboard</a><br>
  			
    <h1>Title: <c:out value="${song.title}"/></h1>
   	<h1>Artist: <c:out value="${song.artist}"/></h1>
    <h1>Rating (1-10): <c:out value="${song.rating}"/></h1>
    
    <br>

    <form action="/songs/<c:out value="${song.id}"/>" method="post">
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="delete">
    </form>

</body>
</html>