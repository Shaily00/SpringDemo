package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
("birthdayGreet")
public class BirthdayGreeting implements Greeting {
	
	public BirthdayGreeting() {
		System.out.println("Birthday Greeting created");
		// TODO Auto-generated constructor stub
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happpppppppppppy Birthdayyyyyyy to youuuuuuuuuu!!!";
	}

}
