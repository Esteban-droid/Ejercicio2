<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<h1>Nuevo Dojo</h1>
		
	<form:form action="/dojos/create" method="post" modelAttribute="dojo">
		
		<p>
			<form:label path="name">Nombre:</form:label>
			<form:input path="name" />
		</p>
		
		<input type="submit" value="Crear" />
	</form:form>

</body>
</html>