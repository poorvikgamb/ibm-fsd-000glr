<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fill in the details in student</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
first name:<form:input path="firstName" />
last name:<form:input path="lastName" />
		<input type="submit" />
	</form:form>
</body>
</html>