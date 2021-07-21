package com.sivaram.learning.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Student {

	@Id
	@SequenceGenerator(
				name = "student_sequence",
				sequenceName = "student_sequence",
				allocationSize = 1
			)
	@GeneratedValue(
				strategy = GenerationType.SEQUENCE,
				generator = "student_sequence"
			)
	private Long studentId;
	private String firstName;
	private String lastName;
	private String emailId;
	
	
	private Guardian guardian ;
	
}
