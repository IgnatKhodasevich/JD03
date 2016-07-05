<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <link rel="stylesheet" href="resources/css/bootstrap.min.css">
 <link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
 <link href="resources/css/bootstrap.css" rel="stylesheet">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 <script src="resources/js/bootstrap.min.js"></script>
<title>All rooms</title>
</head>
<body>

	<table class="table table-bordered table-hover">
    <thead>
    <tr>
        <th>Number</th>
        <th>Type</th>
        <th>Price per day</th>
        <th>Floor</th>
        <th>Number of places</th>
        <th>Status</th>        
   </tr>
 		 </thead>
   <tbody>
   <tr>
     
    <c:forEach var="room" items="${requestScope.all_rooms}">
   	
     
	
			<tr>
			
				<td><c:out value="${room.number}" /></td>
				<td><c:out value="${room.type}" /></td>
				<td><c:out value="${room.pricePerDay}" /></td>
				<td><c:out value="${room.floor}" /></td>
				<td><c:out value="${room.numberOfPlaces}" /></td>
				<td><c:out value="${room.status}" /></td>
				
				
				
			</tr>
					
			 
		</c:forEach>
    		
   
       
    </tr>
   </tbody>
        </table>
	


</body>
</html>