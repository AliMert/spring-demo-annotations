package com.ozhayta.java_config_class;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ozhayta.springdemo.Coach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// load the spring from java configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		// call our new swim coach methods ... has the props values injected
		System.out.println("\nemail: " + ((SwimCoach) theCoach).getEmail());
		System.out.println("team: " + ((SwimCoach) theCoach).getTeam() + "\n");
		
		// close the context
		context.close();
	}

}
