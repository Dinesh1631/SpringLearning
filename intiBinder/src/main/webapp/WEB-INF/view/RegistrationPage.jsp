<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<style>
      .error {
         color: #ff0000;
         text-align:left;
         position:fixed;
         margin-left:30px;
      }  
   </style>
</head>
<body>
	<h4 align="center">This is Registration Page</h4>
	<form:form action="process" modelAttribute="studentInfo">
	<p align="center">
	<label>userName : </label>
	<form:input id="userName" path="userName"/>
	 <form:errors path = "userName" cssClass = "error" />
	<br/><br/>
	
	<label>password : </label>
	<form:password id="password" path="password"/>
	<br/><br/>
	
	<label>Date : </label>
	<form:input id="date" path="date"/>
	<form:errors path = "date" cssClass = "error" />
	<br/><br/>
	
	<label>Salary : </label>
	<form:input id="salary" path="salary"/>
	<form:errors path = "salary" cssClass = "error" />
	<br/><br/>
	
	<label>E-Mail : </label>
	<form:input id="email" path="email"/>
	<form:errors path = "email" cssClass = "error" />
	<br/><br/>
	
	<label>Currency : </label>
	<form:input id="currency" path="currency"/>
	<form:errors path = "currency" cssClass = "error" />
	<br/><br/>
	
	 <input type="submit" name="submit" value="submit">
	</p>
	</form:form>
	
</body>
</html>