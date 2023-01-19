package com.cg.datesexampleinjava8;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateClassExample {

	public static void main(String[] args) {
		
		//Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Today = " + today);
		
		//create own date
		LocalDate independenceDay = LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println("India Got Independence on " + independenceDay);
		
		//current date in "Asia/Tokyo"
		LocalDate todayAtTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("Today At Tokyo = " + todayAtTokyo);	
		
		//America/Los_Angeles
		LocalDate todayAtLos_Angeles = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Today At Los_Angeles = " + todayAtLos_Angeles);	
				
		//Current Date
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now = " + now);
		
		//current date in "Asia/Tokyo"
		LocalDateTime todayTimeAtTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("Today At Tokyo = " + todayTimeAtTokyo);	
		
		//America/Los_Angeles
		LocalDateTime todayTimeAtLos_Angeles = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Today At Los_Angeles = " + todayTimeAtLos_Angeles);

	}

}
