<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Todo App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container mt-5">
    <form action="#" method="get">
        <h1 class="text-center">Todo's Tasks</h1>
        <div class="col-sm-10 mt-5">
            <input type="text" name="todo-item" class="form-control" placeholder="Enter the task">
        </div>
        <div class="col-sm-10 mt-5">
            <input type="submit" value="Add todo item" class="btn btn-primary">
        </div>
    </form>
    <br>
    
    <%
        List<String> todoItemList = (List<String>) session.getAttribute("todoitem");
        if (todoItemList == null) {
            todoItemList = new ArrayList<>();
            session.setAttribute("todoitem", todoItemList);
        }
        
        String item = request.getParameter("todo-item");
        if (item != null && !item.trim().equals("") && !todoItemList.contains(item)) {
            todoItemList.add(item);
        }
        
        for (String s : todoItemList) {
            out.println("<h2>Todo's item : " + s + "</h2>");
        }
    %>
</div>
</body>
</html>
