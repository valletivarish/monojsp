<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--Expression tag  -->
	<h1>hello varish</h1>
	today date is <%= new Date() %>
	<br>
	sum of a and b is <%= 10+20 %>
	<br>
	is 10 greater than 20 <%= 10>20 %>
	<br>
	string in upper case <%= new String("hello").toUpperCase() %>
	
	<!--Scriptlet tag -->
	<%
		for(int i=0;i<5;i++){
			out.println("<h4>"+i+"</h4>");
		}
	%>
	<!-- declaration tag -->
	<%!
    String convertToUpperCase(String str){
        return str.toUpperCase();
    }
	%>
	<%= convertToUpperCase("varish") %>
	<%!
 	String firstLetterOfEachWordToUppercase(String str){
  	String[] arr = str.split(" ");
    StringBuffer string = new StringBuffer();
     for (int i = 0; i < arr.length; i++) {
         string.append(arr[i].substring(0,1).toUpperCase()).append(arr[i].substring(1)).append(" ");
     }          
     return string.toString().trim(); 
 	}
	%>
	<%=firstLetterOfEachWordToUppercase("india is my country.")%>


	
	
</body>
</html>