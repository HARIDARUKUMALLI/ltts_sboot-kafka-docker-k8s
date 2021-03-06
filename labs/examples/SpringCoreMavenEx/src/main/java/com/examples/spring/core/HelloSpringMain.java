package com.examples.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringMain {

	public static void main(String[] args) {
		
		// Instantiating the container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
				
		Greetings obj = (Greetings) context.getBean("greetings");
		obj.getMessage();	
		
		context.registerShutdownHook();
		
	}

}
