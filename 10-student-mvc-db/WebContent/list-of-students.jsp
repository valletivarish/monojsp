<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Details</title>
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
	<div class="container-lg my-5">
		<h1 class="text-center my-5">Student Details</h1>
		<form action="student" method="get">
			<div class="col-sm-10">
				<input type="hidden" name="command" value="search">
				<select class="form-select form-select-lg mb-3"
					aria-label=".form-select-lg example" name="select">
					<option selected>Open this select menu</option>
					<option value="rollnumber">Roll Number</option>
					<option value="name">Name</option>
					<option value="percentage">Percentage</option>
				</select>
			</div>
			<div class="d-flex my-3">
				<input type="text" class="form-control" name="search" placeholder="Search roll number, name, percentage">
				<input type="submit" class="btn btn-primary mx-2" value="Search">
			</div>
			
		</form>

		<table class="table table-hover table-bordered border-primary">
			<thead>
				<tr>
					<th>Roll Number</th>
					<th>Name</th>
					<th>Percentage</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="student" items="${theStudentList}">
					<tr>
						<td>${student.rollNumber}</td>
						<td>${student.name}</td>
						<td>${student.percentage}</td>
						<td><a
							href="student?command=load&rollnumber=${student.rollNumber}"
							class="btn btn-warning">Update</a></td>
						<td><a
							href="student?command=delete&rollnumber=${student.rollNumber}"
							class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-student.jsp" class="btn btn-primary">Add Student</a>

	</div>
</body>
</html>