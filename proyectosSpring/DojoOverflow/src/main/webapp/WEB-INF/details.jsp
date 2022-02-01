<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

	 	<h2><c:out value="${question.questionText}"/></h2>
	

					<table>
				    	<thead>
				        	<tr>
				            	<th>Answers</th>
				       		</tr>
				    	</thead>
				    	<tbody>
				        	<c:forEach items="${question.answers}" var="answer">
				        	<tr>
				            	<td style="text-align: center;"><c:out value="${answer.answerText}"/></td>
				        	</tr>
				        	</c:forEach>
				    	</tbody>
					</table>

					<form:form action="/questions/addAnswer" method="POST" modelAttribute="answer"> 

					    <form:input type="hidden" path="question" value="${question.id}"/>

				        <p>
					        	<form:label path="answerText">Answer:</form:label>
					        	<form:textarea rows="5" type="text" path="answerText"/>
				        </p>

						<p>
						
						    	<input type="submit" value="Añadir"/>
						    	
				    	</p>
					</form:form>

</body>
</html>