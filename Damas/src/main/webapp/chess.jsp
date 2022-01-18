<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

	<head><link href="estilos.css" rel="stylesheet" type="text/css"></head>

	<body>

	<h1> Chess </h1>
	
	<% String filas = request.getParameter("filas"); %>
	<% String columnas = request.getParameter("columnas"); %>

	<%
	   for (int columnass=1; columnass<=5; columnass++) {
	
	  for (int filass=1; filass<=5-1; filass++) {
		
		  out.print("██");
		  out.print(" ⬜ ");
	  }
	  out.print("<br>");
	  for (int filass=1; filass<=5-1; filass++) {
			
		  out.print(" ⬜ ");
		  out.print("██");
		  }
	  out.print("<br>");
	  }%>
  	</body>
</html>