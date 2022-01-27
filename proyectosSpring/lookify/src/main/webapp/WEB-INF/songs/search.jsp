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
	<h1>Buscador!</h1>
	
	<a href="/dashboard">Dashboard</a><br>
	
	<h2>Songs by artist: <c:out value="${artist}"/></h2>
	
			<table>
		    <thead>
		        <tr>
		            <th>Nombre</th>
		            <th>Rating</th>
		            <th>Action</th>
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