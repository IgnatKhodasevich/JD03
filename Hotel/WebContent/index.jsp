<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
 <link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
 <link href="resources/css/bootstrap.css" rel="stylesheet">
 <link href="resources/css/main.css" rel="stylesheet">
 <script type="text/javascript" src="resources/js/deleteUser.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 <script src="resources/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Welcome</title>
</head>
<body>

   <fmt:setLocale value="${sessionScope.locale}" /><!-- locale = ru -->
   <fmt:setBundle basename="resources.locale" var="loc" /><!-- locale_ru  -->
   
   <fmt:message bundle="${loc}" key="locale.change_language.ru" var="ru" />
   <fmt:message bundle="${loc}" key="locale.index.login" var="login" />
   <fmt:message bundle="${loc}" key="locale.index.password" var="password" />


	<jsp:useBean id="errorMessage" class="java.lang.String" scope="request" />


	<a href="Controller?command=change_language&language=ru">${ru}</a>
	<a href="Controller?command=change_language&language=en">en</a>


	<br />

	<form action="Controller" method="post" class="form-horizontal" id="enterForm">
		<input type="hidden" name="command" value="logination" /> 
		<div class="control-group">
			<label class="control-label" for="">${login}:</label>
    		<div class="controls">
     			<input type="text" name="login" value="" /> 
    		</div>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="">${password}:</label>
    		<div class="controls">
     			<input type="password" name="password" value="" /> 
    		</div>
		</div>
		
		
		 
		<i> 
		<c:out	value="${errorMessage}" />

		</i> <br /> 
		<input type="submit" name="Sing in" value="Sing in" class="btn btn-primary" id="sign"/><br>
		
	</form>
	
	<form action="Controller" method="post" id="regButton">
		<input type="hidden" name="command" value="add_new_user_form" /> 					
		<br><input type="submit" name="sing in" value="Registration" class="btn btn-primary" id="reg"/>
		</form>
	

	

</body>
</html>