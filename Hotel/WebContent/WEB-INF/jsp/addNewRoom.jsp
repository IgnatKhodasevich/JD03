<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE htm>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="errorMessage" class="java.lang.String" scope="request" />
Add new room
<p/>
	<fieldset>
	<legend>Add new room</legend>
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="add_new_room" /> 
		Number: <input type="text" name="number" value="" /><br />
		Type: <select name="type"> 
				<option value="Usual room">Usual room</option>
				<option value="Suit">Suit</option>
				<option value="Apartments for family">Apartments for family</option>
			</select><br>
		Price per day (EUR): <input type="text" name="price_per_day" value="" pattern="[0-9]{3}" /> <br /> 
		Floor: <select name="floor"> 
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
			</select><br>
		Number of places: <select name="number_of_places"> 
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
			</select><br>
		Status: <select name="status"> 
				<option value="available">available</option>
				<option value="not available">not available</option>
			</select><br>
		<input type="submit" name="add" value="Add" />
	</form>
	</fieldset>
	<br>
	<c:out	value="${errorMessage}" />
	
</body>
</html>