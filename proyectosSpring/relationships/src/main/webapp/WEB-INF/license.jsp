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
	<h1>Nueva Licencia</h1>
	<form:form action="/licenses/create" method="post" modelAttribute="license">
		<form:label path="person">Name</form:label>
		<form:select path="person">
			<c:forEach items="${persons}" var="person">
				<form:option value="${person.id}">
					<c:out value="${person.firstName}  ${person.lastName}" />
				</form:option>
			</c:forEach>
		</form:select>
		<form:label path="state">State: 
				<form:input type="text" path="state" />
		</form:label>
		<br>
		<form:label path="expirationDate">Expiration Date: 
				<form:errors path="expirationDate" />
			<form:input type="date" path="expirationDate" />
		</form:label>
		<br>
		<input type="submit" value="Create">

	</form:form>
</body>
</html>