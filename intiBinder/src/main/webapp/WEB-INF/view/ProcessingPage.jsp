<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ProcessingPage</title>
</head>
<body>
  <h4 align="center">This Processing Page</h4>
  <p align="center">
  My name is : ${studentInfo.userName}
  <br/><br/>
  My Password is : ${studentInfo.password};
  <br/><br/>
  My DOB is : ${studentInfo.date};
  
   <br/><br/>
  My salary is : ${studentInfo.salary} ${studentInfo.currency}
  
  <br/><br/>
  My Email is : ${studentInfo.email};
  </p>
</body>
</html>