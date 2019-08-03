package com.zensar.spring;
/* Author: Shaily
 * Creation Date: 27/07/19
 * Modified Date:27/07/19
 * Version:1.0
 * Copyright: zensar technologies. All rights reserved
 * Description: It is a Happy Birthday Greeting class
 */

public class BirthdayGreeting implements Greeting {
	
	public BirthdayGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("birthday greeting created");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "wish you a very happy birthday";
	}

}
