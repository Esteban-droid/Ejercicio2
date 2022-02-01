<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
		<h1 class="title">Sección de preguntas</h1>

		<table>
			<thead>
				<tr>
					<td>Preguntas hechas</td>
					<td>Tags</td>
				</tr>
			</thead>
			<tbody>
					<c:forEach items="${questions}" var="question">
					<tr>	
					<td style="text-align: center;"><a href="/questions/${question.id}"><c:out value="${question.questionText}"/></a></td>
					<!--  
							<td>
							<c:forEach items="${q.tags}" var="tags">
								${tags.subject}
							</c:forEach>
							</td>-->
							
					</tr>
					</c:forEach>
			</tbody>
		</table>
		
		<br>
		
		<a href="/questions/new">Nueva pregunta</a>

</body>
</html>