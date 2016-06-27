<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
Add new Room
<p/>
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="add_new_room" /> 
		Type: <input type="text" name="type" value="" /><br />
		Price a day: <input type="text" name="price_a_day" value="" /> <br /> 
		<input type="submit" name="add" value="add" />
	</form>
</body>
</html>