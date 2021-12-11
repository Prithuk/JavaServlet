<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
<%@ include file="header.jsp"%>
</head>
<body>
	<a href="StudentController?actions=student_new">New Student</a>
	<c:if test="${!empty students}">
		<table>
			<thead>
				<tr>
					<th>SN</th>
					<th>ID</th>
					<th>Student Name</th>
					<th>College Name</th>
					<th>Email</th>
					<th>Actions</th>


				</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="s" varStatus="d">
					<tr>
						<td><c:out value="${d.count }" /></td>
						<td><c:out value="${s.id}" /></td>
						<td><c:out value="${s.studentName}" /></td>
						<td><c:out value="${s.collegeName}" /></td>
						<td><c:out value="${s.email}" /></td>
						<td><a
							href="StudentController?actions=student_Edit &id =${s.id}">
								Edit</a> <a
							href="StudentController?actions=student_delete&id =${s.id}">
								Delete</a></td>


					</tr>
				</c:forEach>
			</tbody>

		</table>

	</c:if>
</body>
</html>