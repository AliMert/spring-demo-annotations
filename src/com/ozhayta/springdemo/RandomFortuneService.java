package com.ozhayta.springdemo;

import java.util.Random;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService, DisposableBean {
	
	// create an array of string
	private String[] data = {
			"Beware of the wolf in sheep's clothes",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a Random number generator
	private Random myRandom = new Random();
	
	
	public RandomFortuneService() {
		System.out.println("RandomFortuneService: default constructor");
	}
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("RandomFortuneService: destroy method runs");
	}

}
