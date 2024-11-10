<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registration Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<div class="container mt-5">
		<h1 class="text-success text-center">${msg}</h1>

		<!-- Center the form inside a responsive container -->
		<div class="row justify-content-center">
			<div class="col-12 col-sm-10 col-md-8 col-lg-6 col-xl-5">
				<!-- Adjusted for all screen sizes -->
				<form:form action="edit" modelAttribute="student"
					class="border p-4 bg-light rounded shadow-sm">

					<!-- Name and Phone Fields -->
					<div class="form-row">

						<div class="form-group">
							<form:label path="id">Id:</form:label>
							<form:input path="id" type="number" class="form-control w-100"
								readonly="true" />
						</div>

						<div class="form-group">
							<form:label path="name">Name:</form:label>
							<form:input path="name" type="text" class="form-control w-100" />
						</div>

						<div class="form-group ">
							<form:label path="phone">Phone:</form:label>
							<form:input path="phone" type="number" class="form-control w-100" />
						</div>
					</div>

					<!-- Email and Password Fields -->
					<div class="form-row">
						<div class="form-group ">
							<form:label path="email">Email:</form:label>
							<form:input path="email" type="email" class="form-control w-100" />
						</div>

						<div class="form-group ">
							<form:label path="password">Password:</form:label>
							<form:input path="password" type="password"
								class="form-control w-100" />
						</div>
					</div>

					<!-- Submit and Reset Buttons -->
					<div class="form-row mt-4">
						<div class="">
							<button type="submit" class="btn btn-primary w-100 mt-4">Submit</button>
						</div>
						
					</div>
				</form:form>
			</div>
		</div>
	</div>

	<!-- Include Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
