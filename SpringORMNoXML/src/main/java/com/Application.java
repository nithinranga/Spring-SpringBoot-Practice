package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.dao.StudentDAO;
import com.model.Student;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		StudentDAO studentDAO = ctx.getBean("studentDAO", StudentDAO.class);
		
//		studentDAO.saveStudent(new Student("fayaz", 10));
//		System.out.println("inserted...");
		Student student = studentDAO.getStudent(1);
		System.out.println(student);
	}

}
