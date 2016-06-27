<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	
   <fmt:setLocale value="${sessionScope.locale}" /><!-- locale = ru -->
   <fmt:setBundle basename="resources.locale" var="loc" /><!-- locale_ru  -->
   
   <fmt:message bundle="${loc}" key="locale.change_language.ru" var="ru" />
   <fmt:message bundle="${loc}" key="locale.change_language.en" var="en" />


	<a href="Controller?command=change_language&language=ru">${ru}</a>|
	<a href="Controller?command=change_language&language=en">${en}</a>

<br/>
<br/>
	Hello, user!
	
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="show_free_rooms" /> 
		 <input type="submit" name="sing in" value="show free rooms" />
	</form>
	
	<br/>
	
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="add_new_room_form" /> 
		 <input type="submit" name="sing in" value="add new room" />
	</form>
	<br>
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="get_all_users" /> 
		 <input type="submit" name="sing in" value="show all users" />
	</form>
	

</body>
</html>