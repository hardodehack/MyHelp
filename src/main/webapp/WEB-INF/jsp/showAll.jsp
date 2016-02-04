<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Show All Ticket | MyHelp Ticket System</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>

<div class="back"><p><a href="index.jsp">Back to main page</a></p></div>
<div class="formarea">

	<div class = "container">
		<h2 class="title">Show all ticket</h2>
		<h3>Click <a href="showAllTicket.do">here</a> to show all tickets in the system. </h3>
		
		<table width="960px">
			<c:forEach items="${ticketList}" var="item">
	   			 <tr>      
			        <td>
			        	<p> <c:out value="${item.id}"/> </p>
			        </td>
			        <td> 
			        	<p> <c:out value="${item.firstName}"/> </p>
			        </td>
			        <td> 
			        	<p> <c:out value="${item.lastName}"/> </p>
			        </td>
			        <td width="30%">
			        	<p> <c:out value="${item.description}"/> </p>
			        </td>
			        <td> 
			        	<p> <c:out value="${item.date}"/> </p>
			        </td> 
			        <td> 
			        	<p> <c:out value="${item.priority.priority}"/> </p>
			        </td>  
			        <td> 
			        	<p> <c:out value="${item.status.status}"/> </p>
			        </td>  
			        <td width="10%"> 
			        	<p> <c:out value="${item.comments}"/> </p>
			        </td> 
	    		</tr>
			</c:forEach>
		</table>
	</div>

</div>
</body>


</html>
