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
<title>Add contact</title>
</head>
<body>
	<h1 style="text-align: center;">Add new contact</h1>
	<div class="container text-center mt-6">
		<form:form action="/savecontact" method="post" modelAttribute="contact" style="margin-left: 400px;">
		<table class="text-center">
			<tr>
				<td><label for="user" class="col-form-label col-10">
					<h5>Choose a User :</h5>
				</label></td>
				<td><form:select path="user" class="form-control col-12">
					<form:option value="NONE" label="--- Select ---"/>
					<form:options items="${usernames}"/>
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td><label for="phoneNumber" class="col-form-label col-10">
					<h5>Phone Number :</h5>
				</label></td>
				<td><form:input path="phoneNumber" class="form-control col-12" /></td>
			</tr>
			
			<tr>
				<td><label for="Email" class="col-form-label col-10">
					<h5>Email :</h5>
				</label></td>
				<td><form:input path="Email" class="form-control col-12" /></td>
			</tr>
			
			<tr>
				<td><label for="message" class="col-form-label col-10">
					<h5>Message :</h5>
				</label></td>
				<td><form:input path="message" class="form-control col-12" /></td>
			</tr>
			
			</table>
			<button type="submit" class="btn btn-success btn-lg">Submit</button>
		</form:form>
	</div>

</body>
</html>