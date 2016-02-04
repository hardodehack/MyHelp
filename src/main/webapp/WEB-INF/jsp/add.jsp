<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add a Ticket | MyHelp Ticket System</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>

<div class="back"><p><a href="index.jsp">Back to main page</a></p></div>
<div class="formarea">

	<div class="container">
		<h2 class="title">Add a ticket</h2>
		<h3>Please fill in the form: </h3>
		
		<form id="addTicket" action="submit.do" method="post">
			<table width="500px">
			
			<tr>
				<td><p>First Name:</p></td> 
				<td><input type="text" name="firstName" style="width: 80%;" maxlength="50"></td>
			</tr>
			<tr>
				<td><p>Last Name:</p></td> 
				<td><input type="text" name="lastName" style="width: 80%;"maxlength="50"></td>
			</tr>
			<tr>
				<td><p>Problem description:</p></td> 
				<td><textarea style="width: 80%; height: 200px; resize: none;" name="description" form="addTicket" maxlength="65535"></textarea></td>
			</tr>
			<tr>
				<td><p>Date:</p></td> 
				<td><input type="date" name="date" style="width: 80%;"></td>
			</tr>
			<tr>
				<td><p>Priority:</p></td> 
				<td><select name="priority.priority" style="width: 80%">
    					<option value="HIGH">HIGH</option>
    					<option value="MID">MID</option>
    					<option value="LOW">LOW</option>
  					</select>
  				</td>
			</tr>
			<tr>
				<td><p>Status: </p></td> 
				<td><select name="status.status" style="width: 80%">
    					<option value="OPEN">OPEN</option>
    					<option value="IN PROGRESS">IN PROGRESS</option>
    					<option value="CLOSED">CLOSED</option>
  					</select>
  				</td>
			</tr>
			<tr>
				<td><p>Comments:</p></td> 
				<td><textarea style="width: 80%; height: 100px; resize: none;" name="comments" form="addTicket" maxlength="65535"></textarea></td>
			</tr>
			
			<tr style="height: 100px; vertical-align: middle;">
				<td align="center"><input type="reset" value="Clear"></td>
				<td align="center"><input type="submit" value="Submit"></td>
				
			</tr>
			</table>

		</form>
		
	</div>

</div>
</body>


</html>
