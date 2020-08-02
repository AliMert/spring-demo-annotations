package com.ozhayta.java_config_class;

import com.ozhayta.springdemo.FortuneService;

public class SadFortuneService implements FortuneService {

	// define default constructor
	public SadFortuneService() {
		System.out.println("SadFortuneService: inside default constructor");
	}
	
	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
