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
first name:<form:input path="firstName" /><br>
last name:<form:input path="lastName" /><br>
country:<form:select path="country"><br>
<form:options items="${student.countryOptions}"/>
</form:select><br>
select your language:
English<form:radiobutton path="favoriteLanguage" value="english"/>
Kannada<form:radiobutton path="favoriteLanguage" value="kannada"/>
Hindi<form:radiobutton path="favoriteLanguage" value="hindi"/>
Tamil<form:radiobutton path="favoriteLanguage" value="tamil"/>
		<input type="submit" />
	</form:form>
</body>
</html>