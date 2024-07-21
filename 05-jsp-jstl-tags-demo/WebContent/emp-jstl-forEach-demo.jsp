<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.monocept.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
    <%
        ArrayList<Employee> employees=new ArrayList<Employee>();    
        employees.add(new Employee("Varish",1,10000.0));
        employees.add(new Employee("Shivamani",2,20000.0));
        employees.add(new Employee("Ajay",3,30000.0));
        pageContext.setAttribute("myEmployees", employees);
    %>
   	<div class="container my-5">
   		<h1 class="display-5 text-center my-3">List of Employees</h1>
   		<table class="table table-hover table-dark">
        <thead>
            <tr>
                <th>Name</th>
                <th>ID</th>
                <th>Salary</th>
                <th>Salary Type</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="emp" items="${myEmployees}">
            <tr>
                <td>${emp.name}</td>
                <td>${emp.id}</td>
                <td>${emp.salary}</td>
                <td>
                	<c:if test="${emp.salary>=20000}">
                		High
                	</c:if>
                	<c:if test="${emp.salary<20000}">
                		Low
                	</c:if>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
   	</div>
</body>
</html>