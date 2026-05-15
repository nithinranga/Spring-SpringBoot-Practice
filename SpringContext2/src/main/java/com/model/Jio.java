package com.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("jiosim")
public class Jio implements Sim{
	
	public Jio() {
		System.out.println("Jio Object Created...");
	}

	@Override
	public void call() {
		System.out.println("Jio Calling...");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init called..");
	}
	
}
