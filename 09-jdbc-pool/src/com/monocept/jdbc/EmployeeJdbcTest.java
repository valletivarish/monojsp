package com.monocept.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/EmployeeJdbcTest")
public class EmployeeJdbcTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Resource(name="jdbc/employeedb")
	private DataSource dataSource;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection connection = dataSource.getConnection();
			
			//insert query
			
//			String insertQuery="insert into employee values(?,?,?)";
//			PreparedStatement prepareStatement = connection.prepareStatement(insertQuery);
//			prepareStatement.setInt(1, 6);
//			prepareStatement.setString(2, "vicky");
//			prepareStatement.setDouble(3, 6000.0);
			
			//update query
			
//			String updateQuery="update employee set name=? where id=?";
//			PreparedStatement prepareStatement = connection.prepareStatement(updateQuery);
//			prepareStatement.setString(1, "rahul");
//			prepareStatement.setInt(2, 1);
			
			//delete query
			
//			String deleteQuery="delete from employee where id=?";
//			PreparedStatement prepareStatement = connection.prepareStatement(deleteQuery);
//			prepareStatement.setInt(1, 2);
//			
//			int executeUpdate = prepareStatement.executeUpdate();
//			System.out.println("Number of rows affected : "+executeUpdate);
			
			//select query
			
			String selectQuery="select * from employee";
			PreparedStatement prepareStatement = connection.prepareStatement(selectQuery);
			ResultSet executeQuery = prepareStatement.executeQuery();
			System.out.println("Id\tName\tSalary");
			System.out.println("------------------------");
			while(executeQuery.next()) {
				System.out.println(executeQuery.getInt(1)+"\t"+executeQuery.getString(2)+"\t"+executeQuery.getDouble(3));
				System.out.println("------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
