package com.ozhayta.java_config_class;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ozhayta.springdemo.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// load the spring from java configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		
		// close the context
		context.close();
	}

}
