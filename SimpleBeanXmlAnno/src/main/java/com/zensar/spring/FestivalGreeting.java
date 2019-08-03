package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
("festiveGreeting")
public class FestivalGreeting implements Greeting {
	
	public FestivalGreeting() {
		System.out.println("Festival gretting created");
		// TODO Auto-generated constructor stub
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Rakshabandhan coming soon";
	}

}
