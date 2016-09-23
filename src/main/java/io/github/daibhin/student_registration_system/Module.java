package io.github.daibhin.student_registration_system;

import java.util.ArrayList;

public class Module {
	public String name;
	public String id;
	public ArrayList<Student> students;
	
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
	
	public void addStudent(Student student) {
		students.add(student);
	}
}
