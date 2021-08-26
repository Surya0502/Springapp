<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<title>Register User</title>
</head>
<body>
	<h1 style="text-align: center;">Add new user</h1>
	<div class="container text-center mt-6">
		<form:form action="/saveuser" method="post" modelAttribute="user"
			style="margin-left: 400px;">
			<table class="text-center">
				<tr>
					<td><label for="userId" class="col-form-label col-10">
							<h5>User Id :</h5>
					</label></td>
					<td><form:input path="userId" class="form-control col-12" /></td>
				</tr>

				<tr>
					<td><label for="username" class="col-form-label col-10">
							<h5>User Name :</h5>
					</label></td>
					<td><form:input path="username" class="form-control col-12" /></td>
				</tr>

				<tr>
					<td><label for="password" class="col-form-label col-10">
							<h5>Password :</h5>
					</label></td>
					<td><form:input path="password" class="form-control col-12" /></td>
				</tr>

				<tr>
					<td><label for="address" class="col-form-label col-10">
							<h5>Address :</h5>
					</label></td>
					<td><form:input path="address" class="form-control col-12" /></td>
				</tr>

				<tr>
					<td><label for="course" class="col-form-label col-10">
							<h5>Choose a Course :</h5>
					</label></td>
					<td><form:select path="course" class="form-control col-12">
							<form:option value="NONE" label="--- Select ---" />
							<form:options items="${courseNames}" />
						</form:select></td>
				</tr>

			</table>
			<button type="submit" class="btn btn-success btn-lg">Submit</button>
		</form:form>
	</div>

</body>
</html>