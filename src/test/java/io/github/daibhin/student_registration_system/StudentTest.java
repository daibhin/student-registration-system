package io.github.daibhin.student_registration_system;

import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {
	@Test
	public void evaluateUsername() {
		LocalDate dob = new LocalDate(1995, 05, 31);
		Student student = new Student("David Newell", 21, dob, 13300821);
		assertEquals("David Newell21", student.getUsername());
	}
}
