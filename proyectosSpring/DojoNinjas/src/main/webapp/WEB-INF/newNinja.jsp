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

		<h1>Nuevo ninja</h1>
		
		<form:form action="/ninjas/create" method="post" modelAttribute="ninja">
		
		<p>
			<form:label path="dojo">Dojo:</form:label>
			<form:select path="dojo">
				<c:forEach items="${dojos}" var="dojo">
					<form:option value="${dojo.id}">
						<c:out value="${dojo.name}"/>
					</form:option>
				</c:forEach>
			</form:select>
		</p>
		
		<p>
			<form:label path="firstName">Nombre:</form:label>
			<form:input path ="firstName"/>
		</p>
		
		<p>
			<form:label path="lastName"> Apellido:</form:label>
			<form:input path="lastName"/>
		</p>
		<p>
		
			<form:label path="age">Edad:</form:label>
			<form:input type="number" path="age"/>
		</p>
		
		<input type="submit" value="Crear"/>
		</form:form>
</body>
</html>