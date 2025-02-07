<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Love Calculator Registration</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .container {
      background-color: #fff;
      padding: 30px;
      border-radius: 10px;
      box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
      width: 100%;
      max-width: 400px;
    }

    .form-header {
      text-align: center;
      margin-bottom: 20px;
    }

    .form-header h2 {
      font-size: 24px;
      color: #333;
    }

    .form-body label {
      display: block;
      margin-bottom: 8px;
      font-weight: bold;
      color: #333;
    }

    .form-body input[type="text"],
    .form-body input[type="email"],
    .form-body input[type="password"],
    .form-body input[type="tel"] {
      width: 100%;
      height: 40px;
      margin-bottom: 15px;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
      font-size: 16px;
    }

    .form-body input[type="submit"] {
      width: 100%;
      height: 40px;
      background-color: #4CAF50;
      color: #fff;
      font-size: 16px;
      font-weight: bold;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    .form-body input[type="submit"]:hover {
      background-color: #45a049;
    }

    br {
      margin-bottom: 15px;
    }

  </style>
</head>
<body>
  <div class="container">
    <div class="form-header">
      <h2>Love Calculator Registration</h2>
    </div>
    <div class="form-body">
      <!-- Bind form to userDAO object -->
      <form:form method="POST" action="/SpringSecurity/registerionProcessPage" modelAttribute="userDAO">
        <label for="userName">Username:</label>
        <form:input type="text" path="userName" id="userName" required="true" />

        <br />

        <label for="email">Email:</label>
        <form:input type="email" path="email" id="email" required="true" />

        <br />

        <label for="password">Password:</label>
        <form:input type="password" path="password" id="password" required="true" />

        <br />

        <label for="phoneNumber">Phone Number:</label>
        <!-- Change type to "tel" for phone number -->
        <form:input type="tel" path="phoneNumber" id="phoneNumber" required="true" />

        <br />

        <input type="submit" value="Register" />
      </form:form>
    </div>
  </div>
</body>
</html>
