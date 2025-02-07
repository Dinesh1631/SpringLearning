<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<div align="center">
		<h2>Register Here</h2>
		<form:form action="Success" modelAttribute="userInfo">
			<label>Name : </label>
			<form:input path="Name" />
			<br />
			<br />
			<label>UserName : </label>
			<form:input path="userName" />
			<br />
			<br />
			<label>Password : </label>
			<form:password path="password" />
			<br />
			<br />
			<label>Country : </label>
			<form:select path="country">
				<form:option value="India" label="India" />
				<form:option value="USA" label="USA" />
			</form:select>
			<br />
			<br />
			<label>Gender : </label>
			<form:radiobutton path="Gender" label="Male" value="Male" />
			<form:radiobutton path="Gender" label="FeMale" value="Female" />
			<br />
			<br />
			<label>Hobbies : </label>
			<form:checkbox path="Hobbies" label="Cricket" value="Cricket" />
			<form:checkbox path="Hobbies" label="Reading" value="Reading" />
			<form:checkbox path="Hobbies" label="Finanace" value="Finanace" />

			<br />
			<br />
			<label>Age : </label>
			<form:input path="age" />
			 <form:errors path="age" cssClass="error" />
			<br />
			<br />
			<label>Email : </label>
			<form:input path="communicationDto.email" />
			<br />
			<br />
			<label>Phone : </label>
			<form:input path="communicationDto.phone" />
			<form:errors path="communicationDto.phone" cssClass="error" />
			<br />
			<br />
			<label>Bill : </label>
			<form:input path="billdto" />
			<br />
			<br />
			<input type="submit" value="Submit" />



		</form:form>

	</div>
</body>
</html>