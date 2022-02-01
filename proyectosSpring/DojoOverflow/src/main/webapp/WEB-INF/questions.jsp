<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>

<body>

		<h1>Tu pregunta</h1>
			
		<form:form action="/questions/new" method="post" modelAttribute="addQuestion">
			<div>Pregunta:</div><br>
			<div>
				<form:textarea path="questionText" class="textarea"/> 
				<form:errors path="questionText" />
			</div>
			<br>
			
			<div>Tags:</div><br>
			<div>
				<input name="myTag" class="input"/>
				<c:out value="${errors}"></c:out> 
			</div>

		<div><br>
			<input type="submit" value="Añadir" />
		</div>
		</form:form>

</body>
</html>