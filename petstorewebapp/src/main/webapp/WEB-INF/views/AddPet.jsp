<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Pet Details</h2>
	<br />
	<br />
	<!--<form action="petsuccess" method="post">
		<label for="petName">Enter Pet Name: </label> <input type="text" name="petName">
		<br />
		<label for="type">Enter Type: </label> <input type="text" name="type">
		<br />
		<label for="age">Enter Age of Pet: </label> <input type="number" name="age">
		<br />
		<input type="submit" value="Submit">
	</form>-->

	<form:form method='post' action="petsuccess" modelAttribute="pet">
		<form:label path="petName">Enter Pet Name</form:label>
		<br />
		<form:input path="petName" />
		<br />
		<form:label path="type">Enter Pet Type</form:label>
		<br />
		<form:input path="type" />
		<br />
		<form:label path="age">Enter Pet Age</form:label>
		<br />
		<form:input path="age" />
		<br />
		<input type='submit' value='Save' />
	</form:form>
</body>
</html>