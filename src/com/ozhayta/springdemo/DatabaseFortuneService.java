package com.ozhayta.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService, DisposableBean {
	
	public DatabaseFortuneService() {
		System.out.println("DatabaseFortuneService: default constructor");
	}
	
	@Override
	public String getFortune() {
		return "Database Fortune Service";
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DatabaseFortuneService: destroy method runs");
	}
}
