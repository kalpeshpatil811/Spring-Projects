<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.model.Pet,com.model.Customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>
		<%
		Pet newpet = (Pet) request.getAttribute("newpet");
		out.println(newpet.getPetName() + " Added Successfuly.<br />");
		out.println("Type: " + newpet.getType() + "<br />");
		out.println("Age: " + newpet.getAge() + "<br />");
		%>
	</h3>
</body>
</html>