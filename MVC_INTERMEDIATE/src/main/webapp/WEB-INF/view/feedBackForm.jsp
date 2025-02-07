<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Feedback form</title>
</head>
<body>
	<h1 align="center">FeedBack Form</h1>
	<form:form action="feedbackSuccess" modelAttribute="feedbackDto">
		<p align="center">
		<label>Name: </label>
		<form:input path="name"/>
		<br/><br/>
		
		<label>Email: </label>
		<form:input path="email"/>
		<br/><br/>
		
		<label>Feedback: </label>
		<form:input path="feedback"/>
		<br/><br/>
		
		<button>Submit</button>	
		</p>
	</form:form>


</body>
</html>