package com.monocept.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.monocept.database.BankApplicationDbUtil;
import com.monocept.model.Account;
import com.monocept.model.Customer;
import com.monocept.model.Transaction;

@WebServlet("/admin")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/bank_application")
	private DataSource dataSource;
	private BankApplicationDbUtil bankApplicationDbUtil;

	@Override
	public void init() throws ServletException {
		bankApplicationDbUtil = new BankApplicationDbUtil(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher;
		String command = request.getParameter("command");
		if (command == null) {
			command = "admin";
		}

		try {
			switch (command) {
			case "addCustomer":
				requestDispatcher = request.getRequestDispatcher("add-customer.jsp");
				requestDispatcher.forward(request, response);
				break;
			case "insert":
				insertCustomer(request, response);
				break;
			case "viewCustomers":
				viewCustomers(request, response);
				break;
			case "viewTransactions":
				viewTransactions(request, response);
				break;

			default:
				requestDispatcher = request.getRequestDispatcher("admin-home.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void viewTransactions(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		List<Transaction> transactions = new ArrayList<Transaction>();
		String parameter = request.getParameter("select");
		String searchValueParam = request.getParameter("searchValue");
		if (searchValueParam != null && !searchValueParam.isEmpty()) {
			int searchValue = Integer.parseInt(searchValueParam);
			if ("senderAccountNumber".equals(parameter)) {
				transactions = bankApplicationDbUtil.getTransactionBySenderAccountNumber(searchValue);
			} else if ("receiverAccountNumber".equals(parameter)) {
				transactions = bankApplicationDbUtil.getTransactionByReceiverAccountNumber(searchValue);
			}
		} else {
			transactions = bankApplicationDbUtil.getTransactions();
		}

		request.setAttribute("TheTransactions", transactions);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view-transactions.jsp");
		requestDispatcher.forward(request, response);
	}

	private void viewCustomers(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		Map<Customer, Account> customers = null;
		String parameter = request.getParameter("select");
		if ("accountNumber".equals(parameter) && parameter != null) {
			int searchValue = Integer.parseInt(request.getParameter("searchValue"));
			customers = bankApplicationDbUtil.getCustomersByAccountNumber(searchValue);
		} else if ("name".equals(parameter)) {
			String searchValue = request.getParameter("searchValue");
			customers = bankApplicationDbUtil.getCustomersByName(searchValue);
		} else {
			customers = bankApplicationDbUtil.getCustomers();
		}
		request.setAttribute("TheCustomers", customers);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view-customers.jsp");
		dispatcher.forward(request, response);
	}

	private void insertCustomer(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String first_name = request.getParameter("fname");
		String last_name = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		bankApplicationDbUtil.insertCustomer(new Customer(first_name, last_name, email, password));
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin?command=admin");
		requestDispatcher.forward(request, response);

	}
}