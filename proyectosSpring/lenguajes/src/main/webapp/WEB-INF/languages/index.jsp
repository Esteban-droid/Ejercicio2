<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<title>Languages</title>
</head>
<body>

<h1>Lenguajes</h1>
				
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Actions</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach items="${languages}" var="language">
        <tr>
        
            <td><a href="/languages/<c:out value="${language.id}"/>"><c:out value="${language.name}"/></a></td>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.version}"/></td>
            <td><form action="/languages/<c:out value="${language.id}"/>" method="post">
		    		<input type="hidden" name="_method" value="delete">
    				<input type="submit" value="delete">
				</form>
				
				<form action="/languages/${language.id}/edit" method="get">
					<input type="submit" value="edit">
				</form></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
		
<h2>Nuevo Lenguaje</h2>		
	
<form:form action="/languages" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>

    </p>
    				
    <p>

        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>

    </p>
    				
    <p>

        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>

    </p>   

    <input type="submit" value="Submit"/>

</form:form> 
</body>
</html>