<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h1> Registration Is Success</h1>
	<p>My Name is : ${userInfo.name} </p>
	<br/>
	<p>My userName is : ${userInfo.userName} </p>
	<br/>
	<p>My Password is : ${userInfo.password} </p>
	<br/>
	<p>My Country is : ${userInfo.country} </p>
	<br/>
	<p>My Gender is : ${userInfo.gender} </p>
	<br/>
	<p>My Hobbies are :
	<c:forEach var="hobby" items="${userInfo.hobbies}">
        <li>${hobby}</li>
    </c:forEach>
	</p>
	<br/>
	<p>My Email is : ${userInfo.communicationDto.email} </p>
	<br/>
	<p>My age is : ${userInfo.age} </p>
	<br/>
	<p>My Phone is : ${userInfo.communicationDto.phone} </p>
	<br/>	
	<p>My Bill is : ${userInfo.billdto} </p>
	<br/>	
	</div>
</body>
</html>