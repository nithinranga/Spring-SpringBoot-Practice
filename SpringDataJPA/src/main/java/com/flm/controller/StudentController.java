package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.model.Student;
import com.flm.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
    @GetMapping("/save")
	public String saveStudent() {
		String name=studentService.saveStd();
		return name;
	}
    
    @GetMapping("/studentById")
    public Student getStudentById() {
    	return studentService.getStudent(1);
    }
    
    @GetMapping("/allstudents")
    public List<Student> getAllStudents(){
    	return studentService.allStudents();
    }
    @GetMapping("/delete")
    public String deleteStudent() {
		return studentService.delete(2);
    	
    }
}
