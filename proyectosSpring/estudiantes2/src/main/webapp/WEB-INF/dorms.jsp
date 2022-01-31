<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<h1>Info dormitorio</h1>

<h2>Dormitorio: <c:out value="${dorm.name}" /></h2>

<h2>Integrantes</h2>

<p>
	<form:label path="dorm">Estudiantes:</form:label>
	<form:select path="dorm">
		<c:forEach items="${dorm.students}" var="student">
			<form:option value="${student.id}">
				<c:out value="${student.firstName} ${student.lastName}"/>
			</form:option>
		</c:forEach>
	</form:select>
</p>

<table>
				<thead>
				    <tr>
				      <th>Name</th>
				      <th>Action</th>
				    </tr>
				  </thead>
				  <tbody>
				  	<c:forEach items="${dorm.students}" var="student">
				    <tr>
				      	<td><c:out value="${student.firstName} ${student.lastName}"/></td>
				      	<td>
					      	<form action="/dorms/${dorm.id}/remove/${student.id}" method="post">
	    						<input type="hidden" name="_method" value="delete">
	    						<input type="submit" value="Borrar">
							</form>
						</td>
				    </tr>
				    </c:forEach>
				  </tbody>
			</table>
</body>
</html>