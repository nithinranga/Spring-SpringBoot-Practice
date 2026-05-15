package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.model.Jio;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		SimTest simTest = ctx.getBean("test",SimTest.class);
		SimTest simTest2 = ctx.getBean("test",SimTest.class);
		
		System.out.println(simTest.hashCode());
		System.out.println(simTest2.hashCode());
		
	}

}
