package com.ozhayta.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	private FortuneService fortuneService2;
	
	// define default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	/*
	@Autowired // constructor injection
	public TennisCoach( @Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practise your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	/*
	// define a setter method
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside 'setFortuneService()' method");
		this.fortuneService = fortuneService;
	}
	*/

	// setter injection starts with order (line number)
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService2(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside 'setFortuneService2()' method");
		this.fortuneService2 = fortuneService;
	}
	
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("TennisCoach: @PostConstruct annotation's 'myDestroy()' method runs");		
	}
//	public void destroy() throws Exception {
//		System.out.println("TennisCoach: destroy method runs");
//	}
}
