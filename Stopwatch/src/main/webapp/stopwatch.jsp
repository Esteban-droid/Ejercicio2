<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import = "java.util.Date" %>
    <%@ page import = "java.time.format.DateTimeFormatter" %>
    <%@ page import = "java.text.SimpleDateFormat" %>
    <%@ page import = "java.util.Calendar" %>
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import = "java.util.concurrent.TimeUnit" %>
    <%@ page import = "models.Timerr" %>
    <%@ page import = "javax.swing.Timer" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="estilo.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stopwatch</title>
</head>
<body>

<h1>Stopwatch</h1>

<%Calendar Actual = Calendar.getInstance(); %>

<% Calendar cal = Calendar.getInstance(); %> <!-- Crea un calendario -->

<a href="/Stopwatch/Stopwatch?action=start">Start</a><br><br>
<a href="/Stopwatch/Stopwatch?action=reset">Reset</a><br><br>

<table>
	<tr>
		<th>Empezó</th>
		<th>Se detuvo</th>
		<th>Total segundos</th>
	</tr>
	<tr>
		<td><%out.println(Actual.get(Calendar.HOUR_OF_DAY)+":"+Actual.get(Calendar.MINUTE)+":"+Actual.get(Calendar.SECOND));%></td>
		<td><%out.println(Actual.get(Calendar.HOUR_OF_DAY)+":"+Actual.get(Calendar.MINUTE)+":"+Actual.get(Calendar.SECOND));%></td>
		<td><c:out value="${total}"/></td>
	</tr>
</table>

<br><br>

<!-- ------------------------------------------------------------------ -->



<input type="datetime" value="<%out.println(Actual.get(Calendar.HOUR_OF_DAY)+":"+Actual.get(Calendar.MINUTE)+":"+Actual.get(Calendar.SECOND));%>">



</form>


</body>
</html>