package com.ozhayta.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService, DisposableBean {
	
	public RESTFortuneService() {
		System.out.println("RESTFortuneService: default constructor");
	}
	
	@Override
	public String getFortune() {
		return "REST Fortune Service";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("RESTFortuneService: destroy method runs");
	}
	
	

}
