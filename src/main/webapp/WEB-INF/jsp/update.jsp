<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

	<div class = "container">
		<h2 class="title">Update a ticket</h2>
		<h3>Please input the ticket number to modify: </h3>
		
		<form id="findById" action="findById.do" method="get">
			<input type="number" maxlength="255" name="ticketNumber" value="${ticket.id}"> 
			<input type="submit" name="Submit" value="Show">
		</form>
		
		<c:if test="${not empty ticket.id}">
		<form id="modifyTicket" action="modify.do" method="post">
			<table width="500px">
			<tr>
				<td><input type="hidden" name="id" style="width: 80%;" maxlength="50" value="${ticket.id}"></td>
			</tr>
			<tr>
				<td><p>First Name:</p></td> 
				<td><input type="text" name="firstName" style="width: 80%;" maxlength="50" value="${ticket.firstName}"></td>
			</tr>
			<tr>
				<td><p>Last Name:</p></td> 
				<td><input type="text" name="lastName" style="width: 80%;"maxlength="50" value="${ticket.lastName}"></td>
			</tr>
			<tr>
				<td><p>Problem description:</p></td> 
				<td><textarea style="width: 80%; height: 200px; resize: none;" name="description" form="modifyTicket" maxlength="65535" >${ticket.description}</textarea></td>
			</tr>
			<tr>
				<td><p>Date:</p></td> 
				<td><input type="date" name="date" style="width: 80%;" value="${ticket.date}"></td>
			</tr>
			<tr>
				<td><p>Priority:</p></td> 
				<td><select name="priority.priority" style="width: 80%" value="${ticket.priority.priority}">
    					<option value="HIGH" <c:if test="${ticket.priority.priority=='HIGH'}">selected </c:if> >HIGH</option>
    					<option value="MID" <c:if test="${ticket.priority.priority =='MID'}">selected </c:if>>MID</option>
    					<option value="LOW" <c:if test="${ticket.priority.priority =='LOW'}">selected </c:if>>LOW</option>
  					</select>
  				</td>
			</tr>
			<tr>
				<td><p>Status: </p></td> 
				<td><select name="status.status" style="width: 80%" value="${ticket.status}">
    					<option value="OPEN" <c:if test="${ticket.status.status=='OPEN'}">selected </c:if> >OPEN</option>
    					<option value="IN PROGRESS" <c:if test="${ticket.status.status=='IN PROGRESS'}">selected </c:if> >IN PROGRESS</option>
    					<option value="CLOSED" <c:if test="${ticket.status.status=='CLOSED'}">selected </c:if> >CLOSED</option>
  					</select>
  				</td>
			</tr>
			<tr>
				<td><p>Comments:</p></td> 
				<td><textarea style="width: 80%; height: 100px; resize: none;" name="comments" form="modifyTicket" maxlength="65535" >${ticket.comments}</textarea></td>
			</tr>
			
			<tr style="height: 100px; vertical-align: middle;">
				<td align="center"><input type="reset" value="Reset"></td>
				<td align="center"><input type="submit" value="Update"></td>
				
			</tr>
			</table>

		</form>
		</c:if>
	</div>

</div>
</body>


</html>
