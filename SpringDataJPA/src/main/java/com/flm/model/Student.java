package com.flm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	
	private String name;
	
	private int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	
}
