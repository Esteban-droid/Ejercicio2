<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<h1>Estudiantes</h1>

		<table>
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Edad</th>
					<th>Dirección</th>
					<th>Ciudad</th>
					<th>Estado</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${students}" var="student">
				<tr>
					<td>${student.firstName} ${student.lastName}</td>
					<td>${student.age}</td>
					<td>${student.contact.address}</td>
					<td>${student.contact.city}</td>
					<td>${student.contact.state}</td>		
				</tr>
			</c:forEach>
			</tbody>
		</table>
</body>
</html>