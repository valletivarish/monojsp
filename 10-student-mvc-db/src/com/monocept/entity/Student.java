package com.monocept.entity;

public class Student {
	private int rollNumber;
	private String name;
	private int percentage;

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", percentage=" + percentage + "]";
	}

	public Student(int rollNumber, String name, int email) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.percentage = email;
	}

	public Student(String name, int percentage) {
		this.name = name;
		this.percentage = percentage;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
