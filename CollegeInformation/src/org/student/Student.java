package org.student;

import org.college.College;

public class Student extends College{
	private void studentName() {
		System.out.println("Student Name is Praveen");

	}
	private void studentDept() {
		System.out.println("Student Dept is Computer Science");

	}
	private void studentId() {
		System.out.println("Student Id is 21mcs07");

	}
	public static void main(String[] args) {
		Student c = new Student();
		c.collegeCode();
		c.collegeName();
		c.collegeRank();
		c.studentName();
		c.studentDept();
		c.studentId();
		c.deptName();
		c.hostelName();
	}

}
