package com.monocept.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> attribute = (List<Student>) request.getAttribute("theStudentList");
		System.out.println(attribute);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view-student.jsp");
		requestDispatcher.forward(request, response);
	}
}
