package com.ozhayta.java_config_class;

import org.springframework.beans.factory.annotation.Value;

import com.ozhayta.springdemo.Coach;
import com.ozhayta.springdemo.FortuneService;


public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	// define default constructor
	public SwimCoach() {
		System.out.println("SwimCoach: inside default constructor");
	}
	
		
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("SwimCoach: inside 'fortuneService' arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}
}
