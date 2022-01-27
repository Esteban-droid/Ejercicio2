<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Canciones aqui!</h1>
	
	<a href="/songs/new">Add new</a><br><br>
	
	<a href="/search/topten">Top songs</a><br><br>
	
	<form action="/search/${song.artist}" method="post">
		<input type="submit" value="Search Artists">
		<input type="search" name="artist" placeholder="Artist">
	</form>
	
	<br>
	
	<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Rating</th>
            <th>Actions</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach items="${songs}" var="song">
        <tr>
        
            <td style="text-align: center;"><a href="/songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
            <td style="text-align: center;"><c:out value="${song.rating}"/></td>
            <td style="text-align: center;"><form action="/songs/<c:out value="${song.id}"/>" method="post">
		    		<input type="hidden" name="_method" value="delete">
    				<input type="submit" value="delete">
				</form>
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>