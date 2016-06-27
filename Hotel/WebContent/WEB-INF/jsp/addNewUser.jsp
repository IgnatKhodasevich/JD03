<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<fieldset>
	<legend>Registration</legend>
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="registration" /> 
		Login<br>
		<input type="text" name="login" value="" /><br />
		Password<br>
		<input type="password" name="password" value="" /> <br /> 
		Confirm password<br>
		<input type="password" name="dublPassword" value=""><br>
		Name<br>
		<input type="text" name="name" value="" /><br>
		Surname<br>
		<input type="text" name="surname" value="" /><br>
		<input type="submit" name="add" value="Register" /><br>
		<c:out	value="${errorMessage}" />
		
	</form>
	</fieldset>
</body>
</html>