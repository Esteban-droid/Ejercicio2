<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<title>Edit</title>
</head>
<body>

				<form action="/languages/<c:out value="${language.id}"/>" method="post">
				<input type="hidden" name="_method" value="delete">
				<input type="submit" class="btn btn-link" value="delete">
				</form>
				<a href="/languages">Home </a>
				
				<h2>Edit Language</h2>

				<form:form action="/languages/${language.id}" method="post" modelAttribute="language">
		    	<input type="hidden" name="_method" value="put">

				<form:label path="name">Name</form:label>
				<p><form:errors path="name"/></p>

				<form:input path="name"/>

				<form:label path="creator">Creator</form:label>
				<p><form:errors path="creator"/></p>

				<form:input path="creator"/>

				<form:label path="version">Version</form:label>
				<p><form:errors path="version"/></p>

				<form:input path="version"/>

				<input type="submit" value="Submit" class="btn btn-success"/>

			</form:form>
</body>
</html>