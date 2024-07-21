package com.monocept.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/PreparedStatementTest")
public class PreparedStatementTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/studentdb")
	private DataSource dataSource;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				Connection connection = dataSource.getConnection();
//				String insertQuery="insert into student values(?,?,?)";
//				PreparedStatement prepareStatement = connection.prepareStatement(insertQuery);
//				prepareStatement.setInt(1, 8);
//				prepareStatement.setString(2, "sai kiran");
//				prepareStatement.setInt(3, 90);
//				String updateQuery="update student set percentage=? where rollnumber=?";
//				PreparedStatement prepareStatement = connection.prepareStatement(updateQuery);
//				prepareStatement.setInt(1, 96);
//				prepareStatement.setInt(2, 3);
				String deleteQuery="delete from student where rollnumber=?";
				PreparedStatement prepareStatement = connection.prepareStatement(deleteQuery);
				prepareStatement.setInt(1, 13);
				int executeUpdate = prepareStatement.executeUpdate();

				System.out.println("Number of rows affected : "+executeUpdate);
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}

}
