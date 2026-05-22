package com.flm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flm.dao.StudentRepository;
import com.flm.model.Student;

@Service
public class StudentService {
    
	@Autowired
	StudentRepository studentRepository;
	
	
	public String saveStd() {
		Student st=new Student("Nithin",23);
	Student student=studentRepository.save(st);
	return student.getName();	
	}	 

	public Student getStudent(int id) {
	    Optional<Student> studentOptional = studentRepository.findById(id);
	    Student student= studentOptional.get();
	    return student;
	    }
	
	public List<Student> allStudents() {
		List<Student> list = studentRepository.findAll();
		return list;
	}
	
	public String delete(int id) {
		Student student = studentRepository.findById(id).get();
		studentRepository.delete(student);
		return student.getName() + "Deleted..";
		
	}
 }