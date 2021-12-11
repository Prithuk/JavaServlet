<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<form action="LoginController" method="post">
		<div>
			<label> Username <input type="text" name="username">
			</label>
		</div>

		<div>
			<label> Password <input type="password" name="pass">
			</label>
		</div>

		<div>
			<input type="submit" value="Submit">
		</div>
	</form>
</body>
</html>