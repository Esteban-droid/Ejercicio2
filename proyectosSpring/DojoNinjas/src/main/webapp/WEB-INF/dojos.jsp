<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<h1>Info</h1>

<h2>Dojo: <c:out value="${dojo.name}" /></h2>

<h2>Integrantes</h2>

	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Edad</th>
			</tr>
		</thead>
		<c:forEach items="${dojo.ninjas}" var="ninja">
			<tr>
				<td><c:out value="${ninja.firstName}" /></td>
				<td><c:out value="${ninja.lastName}" /></td>
				<td><c:out value="${ninja.age}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>