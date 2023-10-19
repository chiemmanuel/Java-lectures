package launcher;

import java.util.List;

import datamodel.Admin;
import datamodel.Courses;
import datamodel.Enrollement;
import datamodel.Instructors;
import datamodel.Students;

public class Launcher {

	public static void main(String[] a) {
		Admin admin = new Admin();
		admin.setAdmiId(1);
		admin.setPassword("password");
		admin.setUsername("Admin1");
		
		Courses course = new Courses();
		course.setCourseID(1);
		course.setCourseName("first course");
		course.setCourseDuration("3 weeks");
		
		Enrollement enrollement = new Enrollement();
		enrollement.setDate(null);
		enrollement.setDetails(null);
		enrollement.setEnrollementStatus(null);
		
		Instructors instructor = new Instructors();
		instructor.setInstructorEmail("teacher@email.com");
		instructor.setInstructorId(1);
		instructor.setInstructorName("teacher");
	
		Students student = new Students();
		student.setStudId("1"); // Set the student ID as a string
		student.setName("student1");
		student.setAge("20"); // Set the age as a string
		student.setDepartment("Computer Science");
		student.setYear("2nd"); // Set the year as a string
		student.setCourse(List.of("Math", "Physics", "Programming")); // Set the courses as a List of strings
		student.setFee(1000.0); // Set the fee as a double
		student.setPaid("Yes");
		
	}
	
}
