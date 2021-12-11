package com.prithu.model;

public class Student {

	private int id;
	private String studentName;
	private String collegeName;
	private String email;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
