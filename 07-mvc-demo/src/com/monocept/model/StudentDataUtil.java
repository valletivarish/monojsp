package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudentList() {
		List<Student> students=new ArrayList<Student>();
		students.add(new Student(1,"varish","valleti","varish@monocept.com"));
		students.add(new Student(2,"ajay","rmvl","ajay@monocept.com"));
		students.add(new Student(3,"shivamani","nalla","shivamani@monocept.com"));
		return students;
	}
}
