<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List,com.model.Pet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>View list of rescued pets</h2>
	<br />
	<h3>
		<%
		List<Pet> petList = (List<Pet>) request.getAttribute("petList");
		for (Pet p : petList) {
		%>
		<li>
			<%
			out.println(p.getPetName());
			out.println(p.getType());
			out.println(p.getAge() + "<br />");
			%>
		</li>
		<%
		}
		%>
	</h3>
</body>
</html>