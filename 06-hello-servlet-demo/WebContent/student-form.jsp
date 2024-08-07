<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">Student Form</h2>
		<hr>
		<form action="hello" method="post">
			<div class="col-sm-10 mt-3">
				<label class=".label" for="first-name">Name</label> <input
					class="form-control" type="text" name="first-name" id="first-name">
			</div>
			<div class="col-sm-10 mt-3">
				<label class=".label" for="last-name">Last Name</label> <input
					class="form-control" type="text" name="last-name" id="last-name">
			</div>
			<div class="col-sm-10 mt-3">
				<label class=".label" for="City">City</label> <select
					class="form-select" name="City" id="City">
					<option></option>
					<option value="Hyderabad">Hyderabad</option>
					<option value="Chennai">Chennai</option>
					<option value="Mumbai">Mumbai</option>
				</select>
			</div>
			<div class="col-sm-10 mt-3">
				<label class=".label">Gender</label>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gender"
						value="Male" id="gender-male"> <label
						class="form-check-label" for="gender-male"> Male </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gender"
						id="gender-female" value="Female"> <label
						class="form-check-label" for="gender-female"> Female </label>
				</div>
			</div>
			<div class="col-sm-10 mt-3">
				<label class="label">Languages</label>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="English"
						id="flexCheckDefault" name="Languages"> <label
						class="form-check-label" for="flexCheckDefault">English</label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="Hindi"
						id="flexCheckChecked" name="Languages"> <label
						class="form-check-label" for="flexCheckChecked">Hindi</label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="Telugu"
						id="flexCheckDefaultTelugu" name="Languages"> <label
						class="form-check-label" for="flexCheckDefaultTelugu">Telugu</label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="Tamil"
						id="flexCheckCheckedTamil" name="Languages"> <label
						class="form-check-label" for="flexCheckCheckedTamil">Tamil</label>
				</div>
			</div>
			<div class="col-sm-10 mt-3">
				<input type="submit" value="Submit" class="btn btn-primary">
			</div>
		</form>
	</div>
</body>
</html>