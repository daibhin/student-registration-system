package io.github.daibhin.student_registration_system;

import java.util.ArrayList;
import java.util.Date;

public class Student {
	private String name;
	private int age;
	private Date dob;
	private int id;
	private ArrayList<Module> modules;
	private CourseProgramme course;

	public Student(String name, int age, Date dob, int id, CourseProgramme course) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		this.course = course;
		this.modules = new ArrayList<Module>();
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
	
	public void addToModule(Module module) {
		module.addStudent(this);
		this.modules.add(module);
	}
}
