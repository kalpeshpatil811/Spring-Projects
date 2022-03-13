<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.model.Customer"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>
		<%
		Customer newcustomer = (Customer) request.getAttribute("newcustomer");
		out.println(newcustomer.getCustomerName() + " added successfuly.<br />");
		out.println("Address: " + newcustomer.getAddress());
		%>
	</h3>
</body>
</html>