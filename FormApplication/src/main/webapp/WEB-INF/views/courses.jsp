<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="participant"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<title>Courses</title>
</head>
<body>
<body>
	<h1 style="text-align: center;">Courses Enrolled</h1>
	<div class="container text-center mt-6">
		<table class="table table-striped table-bordered">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Description</th>
					<th>Fee</th>
				</tr>
			</thead>
			<tbody>
				<participant:forEach items="${courses}" var="course"
					varStatus="status">
					<tr>
						<td><h4>${course.courseId}</h4></td>
						<td><h4>${course.courseName}</h4></td>
						<td><h4>${course.courseDescription}</h4></td>
						<td><h4>${course.courseFees}</h4></td>
					</tr>
				</participant:forEach>
			</tbody>
			</table>
			</div>
</body>

</body>
</html>