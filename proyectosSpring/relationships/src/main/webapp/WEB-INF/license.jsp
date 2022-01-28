<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>Nueva Licencia</h1>
	
	<form:form action="/licenses/create" method="post" modelAttribute="license">
	<p>
		<form:label path="person">Nombre</form:label>
		<form:select path="person">
			<c:forEach items="${persons}" var="person">
				<form:option value="${person.id}">
					<c:out value="${person.firstName}  ${person.lastName}" />
				</form:option>
			</c:forEach>
		</form:select>
	</p>
	
	<p>
		<form:label path="state">Estado: 
			<form:input type="text" path="state" />
		</form:label>
	</p>
	<p>
		<form:label path="expirationDate">Expira: 
			<form:input type="date" path="expirationDate" />
		</form:label>
	</p>

		<input type="submit" value="Create">

	</form:form>
</body>
</html>