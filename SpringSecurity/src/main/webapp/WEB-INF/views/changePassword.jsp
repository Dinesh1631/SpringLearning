<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html>
<head>
<title>Change Password</title>
<style>
body {
	font-family: Arial, sans-serif;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
	background-color: #f4f4f4;
}

.form-container {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	width: 300px;
}

h2 {
	text-align: center;
	color: #333;
}

.form-group {
	margin-bottom: 15px;
}

.form-group label {
	display: block;
	font-weight: bold;
	margin-bottom: 5px;
}

.form-group input {
	width: 100%;
	padding: 8px;
	border: 1px solid #ccc;
	border-radius: 4px;
}

.form-group button {
	width: 100%;
	padding: 10px;
	background-color: #4CAF50;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.form-group button:hover {
	background-color: #45a049;
}

 .error-message {
            color: red;
            font-size: 14px;
            font-weight: bold;
            margin-bottom: 20px; /* Add space between error message and form */
            text-align: center; /* Center the error message */
        }
</style>
</head>
<body>
	
        <div style="color: red;">${errorMessage}</div>
	<div class="form-container">
		<h2>Change Password</h2>

		<!-- Spring Form Tag for handling form submission -->
		<form:form method="POST" modelAttribute="password"
			action="changePasswordProcess">

			<!-- Old Password Field -->
			<div class="form-group">
				<label for="oldPassword">Old Password:</label>
				<form:input path="oldPassword" type="password" id="oldPassword" />
			</div>

			<!-- New Password Field -->
			<div class="form-group">
				<label for="newPassword">New Password:</label>
				<form:input path="newPassword" type="password" id="newPassword" />
			</div>

			<!-- Confirm New Password Field -->
			<div class="form-group">
				<label for="conformPassword">Confirm New Password:</label>
				<form:input path="conformPassword" type="password"
					id="conformPassword" />
			</div>

			<!-- Submit Button -->
			<div class="form-group">
				<button type="submit">Submit</button>
			</div>

		</form:form>
	</div>

</body>
</html>
