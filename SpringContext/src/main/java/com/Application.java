package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Address;
import com.model.User;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		
		User user = container.getBean("user",User.class);
		System.out.println(user);
		
	}

}
