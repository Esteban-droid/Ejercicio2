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

	<h1>Make a Dog!</h1>
	
	<form action="Controlador_perro" method="post">
		Name: <input type="text" name="nombre">
		Breed: <input type="text" name="raza">
		Weight: <input type="text" name="peso">
		<input type="submit" value="Enviar información">
	</form>

<br>

		<h1>Make a Cat!</h1>
	
	<form action="Controlador_gato" method="post">
		Name: <input type="text" name="nombre">
		Breed: <input type="text" name="raza">
		Weight: <input type="text" name="peso">
		<input type="submit" value="Enviar información">
	</form>
	

</body>
</html>