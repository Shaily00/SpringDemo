package com.zensar.spring;
/* Author: Shaily
 * Creation Date: 27/07/19
 * Modified Date:27/07/19
 * Version:1.0
 * Copyright: zensar technologies. All rights reserved
 * Description: It is a Happy holi Greeting class
 */

public class HoliGreeting implements Greeting {
	
	public HoliGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Holi Greeting created");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "HappyHoli";
	}

}
