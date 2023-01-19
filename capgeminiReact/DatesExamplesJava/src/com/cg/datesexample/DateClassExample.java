package com.cg.datesexample;

import java.util.Date;

public class DateClassExample {
	
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println("Today = "+ today);
		System.out.println(today.getDate());
		System.out.println(today.getDay());
		System.out.println(today.getYear());
		
	}

}
