package com.monocept.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JDBCDemo")
public class JDBCDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
			Statement stmt = connection.createStatement();
//			String query="insert into student(rollnumber,name,percentage)"+"values(12,'amulya',98)";
//			int executeUpdate = stmt.executeUpdate(query);
//			String query="delete from student where rollnumber=12";
//			int executeUpdate = stmt.executeUpdate(query);
//			String query="update student set name='rmvl ajay' where rollnumber=2";
//			String query = "insert into student(rollnumber, name, percentage) values "
//		             + "(12, 'arjun', 98), "
//		             + "(13, 'john', 85), "
//		             + "(14, 'jane', 91)";
//			int executeUpdate = stmt.executeUpdate(query);
//			System.out.println("Number of rows affected : "+executeUpdate);
			
			String selectQuery="select * from student";
			ResultSet executeQuery = stmt.executeQuery(selectQuery);
			while(executeQuery.next()) {
				System.out.print(executeQuery.getInt("rollnumber")+" ");
				System.out.print(executeQuery.getString("name")+" ");
				System.out.println(executeQuery.getInt("percentage")+" ");
			
				System.out.println("------------------");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}