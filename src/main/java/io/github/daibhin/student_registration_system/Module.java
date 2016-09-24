package io.github.daibhin.student_registration_system;

import java.util.ArrayList;

public class Module {
	private String name;
	private String id;
	private ArrayList<Student> students;
	
	public Module(String name, String id, ArrayList<Student> students) {
		this.name = name;
		this.id = id;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public void addStudents(ArrayList<Student> students) {
		this.students.addAll(students);
	}
}
