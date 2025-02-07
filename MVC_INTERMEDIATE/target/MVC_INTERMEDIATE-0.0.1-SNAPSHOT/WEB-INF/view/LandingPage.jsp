<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Love Calculator</title>
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
    <h1 align="center">Love Calculator</h1>
    <!-- Ensure modelAttribute matches the attribute name in the controller -->
    <form:form action="ProcessingPage" modelAttribute="userInfo">
        <div align="center">
            <p>
                <label>Your Name: </label>
                <form:input path="userName"/>
                <form:errors path = "userName" cssClass = "error" />
            </p>
            <p>
                <label>Crush Name: </label>
                <form:input path="crushName"/>
            </p>
            <p>
           <form:checkbox path="TermsAndConditions" />
            <label>Terms&Conditions</label>
             <form:errors path = "TermsAndConditions" cssClass = "error" />
            </p>
            <button type="submit">Submit</button>
        </div>
    </form:form>
</body>
</html>
