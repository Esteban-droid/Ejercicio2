<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

		<h1>Nuevo dormitorio</h1>	

		<form:form action="/dorms/create" method="post" modelAttribute="dorm">
			<p>
				<form:label path="name">Nombre: </form:label>
				<form:input path="name"/>		
			</p>	
			
			<input type="submit" value="Crear" />
			
		</form:form>
</body>
</html>