<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	student Name:${tempStudent.firstName}<br>
	student country:${tempStudent.country}<br>
	student language:${tempStudent.favoriteLanguage}<br>
	<form:form action="viewStudents">
	<input type="submit" value="view all students">
	</form:form>
</body>
</html>