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

<h1>Crear contacto</h1>

<form:form action="/contacts/new" method="POST" modelAttribute="contact">
	<form:label path="student">Estudiante</form:label>
		<form:select path="student">
			<c:forEach items="${students}" var="student">
				<form:option value="${student.id}">${student.firstName} ${student.lastName}</form:option>
			</c:forEach>
    	</form:select>
    <p>	
		<form:label path="address">Dirección</form:label>
		<form:input path="address"/>
	</p>
		<form:label path="city">Ciudad</form:label>
		<form:input path="city"/>
	<p>
		<form:label path="state">Estado</form:label>
		<form:input path="state"/>
	</p>
	<button>Añadir</button>
</form:form>

</body>
</html>