<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<%@ include file="header.jsp"%>
</head>
<body>

	<form action="StudentController" method="post">

		<div>
			<label>Student Name <input type="text" name="sname">
			</label>

		</div>

		<div>
			<label>College Name <input type="text" name="cname">
			</label>
  
		</div>

		<div>
			<label>Email <input type="email" name="email">
			</label>

		</div>
		<div>
			<input type="Submit" values="Button">
		</div>



	</form>


</body>
</html>