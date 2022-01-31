<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<h1>Nuevo estudiante</h1>

<form:form action="/students/new" method="post" modelAttribute="student">

	<p>
		<form:label path="firstName">Nombre:</form:label>
		<form:input path="firstName" />
	</p>
	
	<p>
		<form:label path="lastName">Apellido:</form:label>
		<form:input path="lastName" />
	</p>
	
	<p>
		<form:label path="age">Edad</form:label>
		<form:input path="age" />
	</p>
								

	<input type="submit" value="Crear"/>

</form:form>
</body>
</html>