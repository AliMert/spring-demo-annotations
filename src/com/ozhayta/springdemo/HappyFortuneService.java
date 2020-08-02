package com.ozhayta.springdemo;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HappyFortuneService implements FortuneService, DisposableBean {
	static int count = 0;

	public HappyFortuneService() {
		System.out.println("HappyFortuneService: default constructor");
		count ++;
	}
	
	@Override
	public String getFortune() {
		return "Today is your lucky day!" + count;
	}

	/* 
	 * Since Scope is 'prototype' destroy() or myDestroy() methods will not run.
	 * Spring does not manage the complete life-cycle of a prototype bean.
	 * A Custom Bean Processor must be created to keep the track of the life-cycle of all beans. 
	 * */
	
	@Override
	public void destroy() throws Exception {
		System.out.println("HappyFortuneService: destroy method runs");
	}
	
	/* 
	 * Since Scope is 'prototype' destroy() or myDestroy() methods will not run.
	 * Spring does not manage the complete life-cycle of a prototype bean.
	 * PreDestroy Annotation does not work with 'prototype' scope,
	 * */
	@PreDestroy 
	public void myDestroy() {
		System.out.println("HappyFortuneService: @PostConstruct annotation's 'myDestroy()' method runs");		
	}
}
