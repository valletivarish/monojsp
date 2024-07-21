package com.monocept.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class helloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public helloServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        ServletContext servletContext = getServletContext();

        String totalEmp = servletContext.getInitParameter("totalEmp");

        String firstName = request.getParameter("first-name");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Hello " + firstName + ", Total Employees: " + totalEmp + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }

}