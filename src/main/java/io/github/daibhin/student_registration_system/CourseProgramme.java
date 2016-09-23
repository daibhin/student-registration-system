package io.github.daibhin.student_registration_system;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class CourseProgramme {
	public String name;
	public ArrayList<Module> modules;
	public LocalDate startDate;
	public LocalDate endDate;
	
	public CourseProgramme(String name,
						   ArrayList<Module> modules,
						   LocalDate startDate,
						   LocalDate endDate) {
		this.name = name;
		this.modules = modules;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public void addModule(Module module) {
		modules.add(module);
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
}
