package com.monocept.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.monocept.database.BankApplicationDbUtil;
import com.monocept.model.Customer;
import com.monocept.model.Transaction;

@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/bank_application")
	private DataSource dataSource;

	BankApplicationDbUtil bankApplicationDbUtil;

	@Override
	public void init() throws ServletException {
		this.bankApplicationDbUtil = new BankApplicationDbUtil(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int attribute = Integer.parseInt((String) session.getAttribute("username"));
		String command = request.getParameter("command");
		if (command == null) {
			command = "user";
		}
		try {
			switch (command) {
			case "passbook":
				viewPassbook(request, response, attribute);
				break;
			case "newTransaction":
				newTransaction(request, response);
				break;
			case "insertTransaction":
				insertTransaction(request, response);
				break;
			case "editProfile":
				editProfile(request,response);
				break;
			case "update":
				updateProfile(request,response);
				break;
			default:
				request.setAttribute("Username", bankApplicationDbUtil.getUsername(attribute));
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("user-home.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	private void updateProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		HttpSession session = request.getSession();
		String username=(String) session.getAttribute("username");
		if(username!=null) {
			int customer_id=Integer.parseInt(username);
			String fname = request.getParameter("fname");
			String lname=request.getParameter("lname");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			Customer customer=new Customer(customer_id,fname, lname, email, password);
			bankApplicationDbUtil.updateDetails(customer);
		}
		response.sendRedirect(request.getContextPath() + "/user");

		
		
	}

	private void editProfile(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		HttpSession session = request.getSession();
		String attribute = (String) session.getAttribute("username");
		if(attribute!=null) {
			int customer_id=Integer.parseInt(attribute);
			request.setAttribute("customerDetails", bankApplicationDbUtil.getAccountDetails(customer_id));
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("edit-profile.jsp");
		requestDispatcher.forward(request, response);
		
	}

	private void insertTransaction(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		HttpSession session = request.getSession();
		String usernameStr = (String) session.getAttribute("username");
		String racc=request.getParameter("raccount");
		String amo=request.getParameter("amount");
		if (usernameStr != null && racc!=null && amo!=null && amo!="" && racc!="" && usernameStr!="") {
			int customer_id = Integer.parseInt(usernameStr);
			int receiver_account_number = Integer.parseInt(racc);
			double amount = Double.parseDouble(amo);
			boolean transactionImplementation = bankApplicationDbUtil.newTransaction(customer_id,receiver_account_number,amount);

			if (transactionImplementation) {
				System.out.println("updated");
				
			} else {
				System.out.println("not updated");
			}
			response.sendRedirect(request.getContextPath() + "/user");
		}

	}

	private void newTransaction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		HttpSession session = request.getSession();
		String usernameStr=(String) session.getAttribute("username");
		
		if(usernameStr!=null) {
			int customer_id=Integer.parseInt(usernameStr);
			request.setAttribute("bankAccountNumber", bankApplicationDbUtil.getAccountNumber(customer_id));
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("new-transaction.jsp");
		requestDispatcher.forward(request, response);
	}

	private void viewPassbook(HttpServletRequest request, HttpServletResponse response, int attribute)
            throws SQLException, ServletException, IOException {
        HttpSession session = request.getSession();
        String usernameStr = (String) session.getAttribute("username");
        int customer_id = 0;
        if (usernameStr != null) {
            customer_id = Integer.parseInt(usernameStr);
            request.setAttribute("bankAccountNumber", bankApplicationDbUtil.getAccountNumber(customer_id));
        }
        List<Transaction> passbook = new ArrayList<Transaction>();
        String parameter = request.getParameter("select");
        String searchValueParam = request.getParameter("searchValue");
        String fromDateStr = request.getParameter("from");
        String toDateStr = request.getParameter("to");
        if (searchValueParam != null && !searchValueParam.isEmpty()) {
            int searchValue = Integer.parseInt(searchValueParam);
            if ("senderAccountNumber".equals(parameter)) {
                passbook = bankApplicationDbUtil.getPassbookBySenderAccountNumber(searchValue, customer_id);
            } else if ("receiverAccountNumber".equals(parameter)) {
                passbook = bankApplicationDbUtil.getPassbookByReceiverAccountNumber(searchValue, customer_id);
            }
        } else if (fromDateStr != null && toDateStr != null) {
            LocalDate fromDate = LocalDate.parse(fromDateStr);
            LocalDate toDate = LocalDate.parse(toDateStr);
            passbook = bankApplicationDbUtil.getPassbookByDate(customer_id, fromDate, toDate);
        } else {
            passbook = bankApplicationDbUtil.getPassbook(attribute);
        }
        request.setAttribute("TheTransactions", passbook);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user-passbook.jsp");
        requestDispatcher.forward(request, response);
    }

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
