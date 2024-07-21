package com.monocept.model;

public class Customer {
	private int customer_id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	public Customer(int customer_id, String first_name, String last_name, String email, String password) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
	}
	public Customer(String first_name, String last_name, String email, String password) {
		this.first_name=first_name;
		this.last_name=last_name;
		this.email=email;
		this.password=password;
	}
	public Customer(String fname, String lname) {
		this.first_name=fname;
		this.last_name=lname;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", password=" + password + "]";
	}
	
}
