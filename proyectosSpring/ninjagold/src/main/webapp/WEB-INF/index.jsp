<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>

</head>
<body>
	<section>
    			Your Gold: <input class="input is-info" type="text" name="myGold" placeholder="<c:out value="${gold}"/>">

    			<h1>Farm</h1>
    			<p>Earn 10-20 gold</p>
    			
    			<form action="/findgold" method="POST">
    				<input class="button is-warning" type="submit" value="Find Gold!">
    				<input type="hidden" name="place" value="farm">
    			</form>

    			<h1>Cave</h1>
    			<p>Earn 5-10 gold</p>
    			<form action="/findgold" method="POST">
    				<input class="button is-warning" type="submit" value="Find Gold!">
    				<input type="hidden" name="place" value="cave">
    			</form>

    			<h1>House</h1>
    			<p>Earn 2-5 gold</p>
    			<form action="/findgold" method="POST">
    				<input class="button is-warning" type="submit" value="Find Gold!">
    				<input type="hidden" name="place" value="house">
    			</form>

    			<h1>Casino!</h1>
    			<p>Earn 0-50 gold</p>
    			<form action="/findgold" method="POST">
    				<input class="button is-danger" type="submit" value="Find Gold!">
    				<input type="hidden" name="place" value="casino">
    			</form>
	</section>
</body>
</html>