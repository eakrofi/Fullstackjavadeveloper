<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learners Academy</title>
</head>
<body>

<h2>Welcome to Learners Academy</h2>

<h3>Login</h3>

<form action="LoginController" method="post">
<label>Username</label>
<input type="text" name="username"><br/>
<label>Password</label>
<input type="password" name="password"><br/>
<input type="submit" value="Login">
<input type="reset">
</form>

</body>
</html>