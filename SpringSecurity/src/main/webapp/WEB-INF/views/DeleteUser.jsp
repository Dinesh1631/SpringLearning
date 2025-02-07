<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    userName is : ${dao.userName}
    <br/><br/>
   <a href="/SpringSecurity/deleteUserProcessing?userName=${userName}">click Here to delete current user</a>
</body>
</html>