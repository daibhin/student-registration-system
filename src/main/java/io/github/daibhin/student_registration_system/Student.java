package io.github.daibhin.student_registration_system;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class Student {
	private String name;
	private int age;
	private LocalDate dob;
	private int id;
	private CourseProgramme course;

	public Student(String name, int age, LocalDate dob, int id) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
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

	public LocalDate getDateOfBirth() {
		return dob;
	}

	public void setDateOfBirth(LocalDate dob) {
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public CourseProgramme getCourse() {
		return this.course;
	}
	
	public void enroll(CourseProgramme course) {
		this.course = course;
	}
}
