<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" href="resources/css/bootstrap.min.css">
 <link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
 <link href="resources/css/bootstrap.css" rel="stylesheet">
 <script type="text/javascript" src="resources/js/deleteUser.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 <script src="resources/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>All users</title>
</head>

<body>

<jsp:useBean id="user" class="by.htp3.hotel.bean.User" scope="request" />



<form action="Controller" method="post">
<input type="hidden" name="command" value="delete_user">
<script type="text/javascript">

function confirmDelete() {

    if (confirm("Do you really want to delete this user?")) {

        return true;

    } else {

        return false;

    }

}

</script>

<table class="table table-bordered table-hover">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Login</th>
        <th>Password</th>
        <th>Delete</th>        
   </tr>
 		 </thead>
   <tbody>
   <tr>
     
    <c:forEach var="user" items="${requestScope.all_users}">
   	
     
	
			<tr>
			
				<td><c:out value="${user.id}" /></td>
				<td><c:out value="${user.name}" /></td>
				<td><c:out value="${user.surname}" /></td>
				<td><c:out value="${user.login}" /></td>
				<td><c:out value="${user.password}" /></td>
				<td><input type="radio" name="name" value="${user.name}"/></td>
				
				
			</tr>
					
			 
		</c:forEach>
    		
   
       
    </tr>
   </tbody>
        </table>
        
        <input type="submit" name="delete" value="Delete" onclick="return confirmDelete();">
    	   </form>
        
        </body>
</html>