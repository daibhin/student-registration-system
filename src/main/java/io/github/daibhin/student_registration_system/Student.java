package io.github.daibhin.student_registration_system;

import java.util.Date;

public class Student {
	private String name;
	private int age;
	private Date dob;
	private int id;

	public Student(String name, int age, Date dob) {
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	
	public String getUsername() {
		return name + age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
