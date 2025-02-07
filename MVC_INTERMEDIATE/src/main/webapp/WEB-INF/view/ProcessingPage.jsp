<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">This ProcessingPage</h1>
	<h1>Hi ${userInfo.userName}</h1>
	<p alig="center">
	my name is : ${userInfo.userName}
	<br> 
	crush name is : ${userInfo.crushName}
	<br> 
	Result is : ${userInfo.result}
	<br>
	<a href="/MVC_INTERMEDIATE/home.com/emailPage">Send result email</a>
	</p>
</body>
</html>