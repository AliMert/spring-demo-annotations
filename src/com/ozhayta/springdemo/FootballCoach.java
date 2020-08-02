package com.ozhayta.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach, DisposableBean {
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	// define default constructor
	public FootballCoach() {
		System.out.println(">> FootballCoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("FootballCoach: destroy method runs");
	}
}
