package com.games.games;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String [] args) {
		//1: Launch a Spring context - 
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2: Configure the things that we want Spring context to anage - 
		//By creating a configuration class - HelloWorldCOnfiguration class with @Configuration
		System.out.println(context.getBean("name"));
	}
}
