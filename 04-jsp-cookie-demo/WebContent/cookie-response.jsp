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
	<%
		String myFavouriteLanguage = request.getParameter("favLangauge");
	Cookie myCookie = new Cookie("favouriteLanguage", myFavouriteLanguage);

	myCookie.setMaxAge(60 * 10);

	response.addCookie(myCookie);
	%>
	<div class="container my-5">
		<p class="display-5">we have set your favourite language</p>
		<a href="cookie-home.jsp" class="btn btn-secondary my-5">Cookie
			home page</a>
	</div>
</body>
</html>