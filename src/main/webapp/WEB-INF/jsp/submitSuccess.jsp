<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">

<title>Submit Ticket Success | MyHelp Ticket System</title>
</head>
<body>
<div class="back"><p><a href="index.jsp">Back to main page</a></p></div>
<div class="formarea">

	<div class="container">
		<h2 class="title">Ticket Submission Successful!</h2>
		<h3>Your ticket number is: ${ticket.id}</h3>
		
		<p>First Name: ${ticket.firstName}</p>
		<p>Last Name: ${ticket.lastName}</p>
		<p>Problem Description: ${ticket.description} </p>
		<p>Date: ${ticket.date}</p>
		<p>Priority: ${ticket.priority.priority}</p> 
		<p>Status: ${ticket.status.status}</p>
		<p>Comments: ${ticket.comments}</p>

	</div>

</div>
</body>
</html>