package com.sivaram.learning.jpa.repo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sivaram.learning.jpa.entity.Guardian;
import com.sivaram.learning.jpa.entity.Student;

@SpringBootTest
class StudentRepositoryTest {

	@Autowired
	private StudentRepository repository;
	
	//@Test
	public void saveStudent() {
		Student student = Student.builder()
				.emailId("test@test.com")
				.firstName("First Name")
				.lastName("Last Name")
				//.guardianName("Gaurdian Name")
				//.guardianEmail("Gaurdian Email")
				//.guardianMobile("Gaurdian Mobile")
				.build();
		
		repository.save(student);
		
	}
	
	@Test
	public void saveStudentWithGuardian() {
		
		Guardian guardian = Guardian.builder()
				.name("Guardian Name")
				.email("Guardian Email")
				.mobile("Guardian Mobile")
				.build();
		
		Student student = Student.builder()
				.firstName("Student First Name")
				.lastName("Student Last Name")
				.emailId("Student Email")
				.guardian(guardian)
				.build();
		
		repository.save(student);
	}
	
	@Test
	public void printAllStudent() {
		List<Student> allStudent = repository.findAll();
		
		System.out.println(allStudent);
	}
}
