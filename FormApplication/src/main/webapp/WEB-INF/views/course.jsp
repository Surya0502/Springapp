<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<title>Add Course</title>
</head>
<body>
	<h1 style="text-align: center;">Add a course</h1>
	<div class="container text-center mt-6">
		<form:form action="/savecourse" method="post" modelAttribute="course"
			style="margin-left: 400px;">
			<table class="text-center">
					<tr>
					<td><label for="courseId" class="col-form-label col-10">
							<h5>Course Id :</h5>
					</label></td>
					<td><form:input path="courseId" class="form-control col-12" /></td>
					</tr>
					
					<tr>
					<td><label for="courseName" class="col-form-label col-10">
							<h5>Course Name :</h5>
					</label></td>
					<td><form:input path="courseName" class="form-control col-12" /></td>
					</tr>
					
					<tr>
					<td><label for="courseDescription" class="col-form-label col-10">
							<h5>Course Description :</h5>
					</label></td>
					<td><form:input path="courseDescription" class="form-control col-12" /></td>
					</tr>
					
					<tr>
					<td><label for="courseFees" class="col-form-label col-10">
							<h5>Course Fees :</h5>
					</label></td>
					<td><form:input path="courseFees" class="form-control col-12" /></td>
					</tr>
			</table>
			<button type="submit" class="btn btn-success btn-lg">Submit</button>
		</form:form>
	</div>

</body>
</html>