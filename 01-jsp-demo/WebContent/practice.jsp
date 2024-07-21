<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
    String name = "varish";
    int age = 22;

    int sum(int x, int y, int z) {
        return x + y + z;
    }
%>

<%= "Name: " + name %>
<br>

<%
    int x = 1, y = 2, z = 3;
    out.println("Age: " + age);
    out.println("<br>");
    out.println("Sum of " + x + "," + y + "," + z + " : " + sum(x, y, z));    
%>

</body>
</html>