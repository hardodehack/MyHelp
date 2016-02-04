<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Delete Ticket | MyHelp Ticket System</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>

<div class="back"><p><a href="index.jsp">Back to main page</a></p></div>
<div class="formarea">

	<div class = "container">
		<h2 class="title">Delete a ticket</h2>
		<h3>Please input the ticket number to delete: </h3>
		
		<form id="findByIdToDelete" action="findByIdToDelete.do" method="get">
			<input type="number" maxlength="255" name="ticketNumber" value="${ticket.id}"> 
			<input type="submit" name="Submit" value="Show">
		</form>
		<table width="860px">
	  		<tr>      
		        <td>
		        	<p> ${ticket.id} </p>
		        </td>
		        <td> 
		        	<p> ${ticket.firstName} </p>
		        </td>
		        <td> 
		        	<p> ${ticket.lastName} </p>
		        </td>
		        <td width="50%">
		        	<p> ${ticket.description} </p>
		        </td>
		        <td> 
		        	<p> ${ticket.date}</p>
		        </td> 
		        <td> 
		        	<p> ${ticket.priority.priority} </p>
		        </td>  
		        <td> 
		        	<p> ${ticket.status.status} </p>
		        </td>  
		        <td> 
		        	<p> ${ticket.comments} </p>
		        </td>  
	   		</tr>
		</table>
		
		<c:if test="${not empty ticket.id}">
		<form id="deleteConfirm" action="deleteTicket.do" method="get">
			<input type="hidden" name="id" value="${ticket.id}">
			<p> Delete this ticket. Proceed? 
			<input type="submit" name="Delete" value="Delete"> </p>
		</form>	
		</c:if>
		
	</div>

</div>
</body>


</html>
