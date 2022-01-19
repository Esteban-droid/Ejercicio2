<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Calculator" method="POST">
<input name="value" type="text"/><br><br>
<input name="plus" type="submit" value="+" /><br><br>
<input name="minus" type="submit" value="-" /><br><br>
<input name="divide" type="submit" value="/" /><br><br>
<input name="multiply" type="submit" value="*" /><br><br>
<h1>Resultado</h1>
<input name="result" readonly="readonly" type="text" value="${result}" /><br><br>
</form>
 

</body>
</html>