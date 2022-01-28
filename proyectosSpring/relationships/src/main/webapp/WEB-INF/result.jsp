<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>Info Licencia</h1>
	
	<h3>Nombre: <c:out value="${person.firstName} ${person.lastName }"/></h3>
	<h3>Número de licencia:  <c:out value="${person.license.number}"/></h3>
	<h3>Estado:   <c:out value="${person.license.state}" /></h3>
	
	<h3>Expiration Date   <c:out value="${person.license.expirationDate}" /></h3>

</body>
</html>