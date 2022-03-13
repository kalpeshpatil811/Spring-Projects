<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Customer Details</h2>
	<br />
	<br />
	<form action='customersuccess' method='post'>
		<label for="customerName">Enter Customer Name</label> <br /> <input type='text' name='customerName' /> <br />
		<label for="address">Enter Customer Address</label> <br /> <input type='text' name='address' /> <br />
		<input type='submit' value='Save' />
	</form>
</body>
</html>