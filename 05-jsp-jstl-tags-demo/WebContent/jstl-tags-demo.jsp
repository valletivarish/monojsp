<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="Varish"></c:set>
	<h1>Welcome ${name}</h1>
	
	<c:if test="${name.length()>=5}">
		<h1>name ${name} has more length than 5</h1>
	</c:if>
	
	<c:choose>
		<c:when test="${name.equals('Varish')}">
			${name}
		</c:when>
		<c:when test="${name.length()>=3}">
			name ${name} has characters more than 3
		</c:when>
		<c:otherwise>
			it has less characters 	
		</c:otherwise>
	</c:choose>
</body>
</html>