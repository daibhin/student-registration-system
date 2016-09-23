package io.github.daibhin.student_registration_system;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Date;

public class StudentTest {
	@Test
	public void evaluateUsername() {
		Date dob = new Date(25, 05, 1995);
		Student student = new Student("David Newell", 21, dob, 13300821);
		assertEquals("David Newell21", student.getUsername());
	}
}
