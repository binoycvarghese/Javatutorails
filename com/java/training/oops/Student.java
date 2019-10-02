package com.java.training.oops;

public class Student {

	private String id;
	private String department;
	private String name;

	public Student() {
		
	}
	
	public Student(String id, String department, String name) {
		this.id = id;
		this.department = department;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
