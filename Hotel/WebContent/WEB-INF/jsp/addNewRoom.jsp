<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE htm>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="resources/css/errorStyle.css" rel="stylesheet">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
 <link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
 <link href="resources/css/bootstrap.css" rel="stylesheet">
 <link href="resources/css/addNewRoom.css" rel="stylesheet">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 <script src="resources/js/bootstrap.min.js"></script>
<title>Add new room</title>
</head>
<body>

<script type="text/javascript">
function showError(container, errorMessage) {
	
      container.className = 'error';
      var msgElem = document.createElement('span');
      msgElem.className = "error-message";
      msgElem.innerHTML = errorMessage;
      container.appendChild(msgElem);
    }

    function resetError(container) {
      container.className = '';
      if (container.lastChild.className == "error-message") {
        container.removeChild(container.lastChild);
      }
    }

    function validate(form) {
      var elems = form.elements;

      resetError(elems.number.parentNode);
      if (!elems.number.value) {
        showError(elems.number.parentNode, ' Specify number of room.');
        return false;
      }

      resetError(elems.price_per_day.parentNode);
      if (!elems.price_per_day.value) {
        showError(elems.price_per_day.parentNode, ' Specify price.');
        return false;
      } 

      return true;

    }
</script>

	<div class="form">
	<fieldset>
	<legend>Add new room</legend>
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="add_new_room" /> 
		<label>Number</label><br>
		<input type="text" name="number" value="" class="sameFields"/><br />
		<label>Type</label><br>
		<select name="type" class="sameFields"> 
				<option value="Usual room">Usual room</option>
				<option value="Suit">Suit</option>
				<option value="Apartments for family">Apartments for family</option>
			</select><br>
		<label>Price per day (EUR)</label><br>
		<input type="text" name="price_per_day" value="" class="sameFields"/> <br /> 
		<label>Floor</label> 
		<select name="floor"> 
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
			</select><br>
		<label>Number of places</label>
		<select name="number_of_places"> 
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
			</select><br>
		<label>Status</label> <br>
		<select name="status" class="sameFields"> 
				<option value="available">available</option>
				<option value="not available">not available</option>
			</select><br><br>
		<input type="submit" name="add" value="Add room" onclick="return validate(this.form)" class="btn btn-primary" id="addRoom"/>
	</form>
	</fieldset>
	</div>
</body>
</html>