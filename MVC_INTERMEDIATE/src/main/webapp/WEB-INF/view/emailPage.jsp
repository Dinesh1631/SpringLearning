<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmailPage</title>
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
	<form:form action="emailSuccessPage" modelAttribute="userInfo">
		<h3>Hi ${userInfo.userName}</h3>
		<br />
		<br />
		<p align="center">
			<label>Enter Email : </label>
			<form:input id="email" path="email" />
			 <form:errors path = "email" cssClass = "error" />
			<br /> <br />

			<button>Submit</button>


		</p>

	</form:form>
</body>
</html>