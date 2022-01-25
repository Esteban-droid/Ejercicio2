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

		<h1 class="text-center">List of Languages</h1>

			 <table>
				<thead>
					<tr>
						<th>Name</th>
						<th>Creator</th>
						<th>Version</th>
						<th>Actions</th>
					</tr>					        		
				</thead>
				<c:forEach items="${languages}" var="language">								    
					<tr>
						<td><a href="/languages/<c:out value="${language.id}"/>"><c:out value="${language.name}"/></a></td>
						<td><c:out value="${language.creator}"/></td>
						<td><c:out value="${language.version}"/></td>
						<td>
							<div class="row">
								<div class="col-sm-6 border-right">
									<form action="/languages/<c:out value="${language.id}"/>" method="post">
									<input type="hidden" name="_method" value="delete">
						    		<input type="submit" class="btn btn-link" value="delete">
									</form>
								</div>
								<div class="col-sm-6 border-left">
									<form action="/languages/${language.id}/edit" method="get">
						    		<input type="submit" class="btn btn-link" value="edit">
									</form>
								</div>
							</div>				
		
						</td>
					</tr>
				</c:forEach>
			</table>

				<h2 class="text-center">New Language</h2>

				<form:form action="/languages" method="post" modelAttribute="language">

				<form:label path="name">Name</form:label>
				<p><form:errors path="name"/></p>

				<form:input path="name"/>
				
				<br><br>

				<form:label path="creator">Creator</form:label>
				<p><form:errors path="creator"/></p>

				<form:input path="creator"/>
				
				<br><br>

				<form:label path="version">Version</form:label>
				<p><form:errors path="version"/></p>

				<form:input path="version"/>
				
				<br><br>

				<input type="submit" value="Submit" class="btn btn-success"/>

				</form:form>

</body>
</html>