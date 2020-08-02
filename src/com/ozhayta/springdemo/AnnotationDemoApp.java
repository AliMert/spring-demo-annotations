package com.ozhayta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		
		// close the context
		context.close();
		
		
		// testing to see all beans are created when context is created
		System.out.println("\n --> Openning and closing context to demonstrate all beans ");
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.close();
	}

}
