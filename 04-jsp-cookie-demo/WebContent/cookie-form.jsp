<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container my-5">
		<p class="lead text-secondary">Select you favorite language</p>
		<form action="cookie-response.jsp">
			<select class="form-select form-select-lg" name="favLangauge">
				<option value="Java">Java</option>
				<option value="C++">C++</option>
				<option value="Python">Python</option>
			</select> <input type="submit" class="btn btn-secondary my-5">
		</form>

	</div>
</body>
</html>