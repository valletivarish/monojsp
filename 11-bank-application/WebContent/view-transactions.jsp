<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>View Transactions</title>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<style>

input[type="date"]::-webkit-clear-button {
	display: none;
}

input[type="date"]::-webkit-inner-spin-button {
	display: none;
}

input[type="date"]::-webkit-calendar-picker-indicator {
	color: #2c3e50;
}

input[type="date"] {
	appearance: none;
	-webkit-appearance: none;
	color: #95a5a6;
	font-family: "Helvetica", arial, sans-serif;
	font-size: 18px;
	border: 3px solid #ecf0f1;
	background: #ffffff;
	padding: 5px;
	display: inline-block !important;
	visibility: visible !important;
}

input[type="date"], focus {
	color: #95a5a6;
	box-shadow: none;
	-webkit-box-shadow: none;
	-moz-box-shadow: none;
}
</style>
</head>
<body class="bg-light">
	<div class="container-lg my-5">
		<a class="btn btn-secondary p-2 px-4" href="admin?command=admin">Go
			Back</a> <a class="btn btn-secondary p-2 px-4" aria-current="page"
			href="logout">Logout</a>
		<h1 class="text-center my-5">Transaction Details</h1>
		<form action="admin" method="get">
			<div class="col-sm-10">
				<input type="hidden" name="command" value="viewTransactions" /> <select
					class="form-select form-select-lg mb-3"
					aria-label=".form-select-lg example" name="select">
					<option selected disabled>Search By Sender and Receiver Account Number</option>
					<option value="senderAccountNumber">Sender Account Number</option>
					<option value="receiverAccountNumber">Receiver Account
						Number</option>
				</select>

			</div>
			<div class="d-flex my-3">
				<input type="text" class="form-control" name="searchValue"
					placeholder="Search by sender and receiver account number" />
			</div>
			<div class="d-flex my-3 align-items-center">
				<label class="label me-2" for="from">From:</label> <input
					type="date" id="from" name="from" class="form-control me-2">

				<label class="label me-2" for="to">To:</label> <input type="date"
					id="to" name="to" class="form-control me-2"> <input
					type="submit" class="btn btn-primary" value="Search">
			</div>

		</form>

		<table class="table table-hover table-bordered border-primary">
			<thead>
				<tr>
					<th>Sender Account Number</th>
					<th>Receiver Account Number</th>
					<th>Date of Transaction</th>
					<th>Type of Transaction</th>
					<th>Amount</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="transaction" items="${TheTransactions}">
					<tr>
						<td>${transaction.sender_account_number}</td>
						<td>${transaction.receiver_account_number}</td>
						<td>${transaction.date_of_transaction}</td>
						<td>${transaction.transaction_type}</td>
						<td>${transaction.transaction_amount}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
