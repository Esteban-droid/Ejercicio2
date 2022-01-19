<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.modelsRoster.Team" %>
<!DOCTYPE html>
<html>
<head>
<link href="estilos.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/otro/newTeam.jsp">New Team</a>
<table>
<tr><th>Team</th><th>Players</th><th>Action</th></tr>
<%for(int i = 0; i < Team.getTeams().size();i++){ %>
<tr>
<td><%= Team.getTeams().get(i).getTeam_name() %>
</td><td>
<%= Team.getTeams().get(i).getPlayers().size() %>
</td><td>
<a href="/otro/Teams?id=<%=i%>">Details</a>
<a href="/otro/Teams?id=<%=i%>&delete=true">Delete</a>
</td>
</tr>
<%} %>
</table>
</body>
</html>