package com.ozhayta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValuesDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FootballCoach footballCoach = context.getBean("footballCoach", FootballCoach.class);
		
		System.out.println(footballCoach.getEmail());
		System.out.println(footballCoach.getTeam());
		
		context.close();
	}
}
