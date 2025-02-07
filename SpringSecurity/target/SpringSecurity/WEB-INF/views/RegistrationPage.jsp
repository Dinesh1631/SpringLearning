<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
}

.container {
	width: 300px;
	background-color: #fff;
	padding: 20px;
	border: 1px solid #ddd;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	margin: 50px auto;
}

form {
	margin-top: 20px;
}

label {
	display: block;
	margin-bottom: 10px;
}

input[type="text"], input[type="email"], input[type="password"],
	input[type="number"] {
	width: 100%;
	height: 40px;
	margin-bottom: 20px;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

input[type="submit"] {
	width: 100%;
	height: 40px;
	background-color: #4CAF50;
	color: #fff;
	padding: 10px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #3e8e41;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Registration Form</h2>
		<form:form modelAttribute="user" method="POST">
			<label for="username">Username:</label>
			<form:input type="text" id="username" path="username" />
			<form:errors path="username" cssClass="error" />

			<label for="email">Email:</label>
			<form:input type="email" id="email" path="email" />
			<form:errors path="email" cssClass="error" />

			<label for="password">Password:</label>
			<form:input type="password" id="password" path="password" />
			<form:errors path="password" cssClass="error" />

			<label for="phoneNumber">Phone Number:</label>
			<form:input type="number" id="phoneNumber" path="phoneNumber" />
			<form:errors path="phoneNumber" cssClass="error" />

			<input type="submit" value="Register" />
		</form:form>
	</div>
</body>
</html>