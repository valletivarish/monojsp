<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<%
		String favouriteLanguage="Java";
		Cookie[] cookies=request.getCookies();
		if(cookies!=null){
			for(Cookie c:cookies){
				if(c.getName().equals("favouriteLanguage")){
					favouriteLanguage=c.getValue();
					break;
				}
			}
		}
			
	%>
	<div class="container my-5">
		<h2 class="display-5">your preferred Language is <%=favouriteLanguage %></h2>
		<hr>
		<a href="cookie-form.jsp" class="btn btn-success">Go back to change your favourite language</a>
	</div>
</body>
</html>