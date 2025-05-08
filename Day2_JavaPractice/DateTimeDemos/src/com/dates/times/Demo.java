package com.dates.times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo {

	public static void main(String[] args) {


		LocalDate  date =  LocalDate.now();
		System.out.println(date);
		System.out.println("Day of Year "+date.getDayOfYear());
		System.out.println("Day of Week "+date.getDayOfWeek());
		System.out.println("Year "+date.getYear());
		
		LocalDate indp = LocalDate.of(1947, 8, 15);
		
			System.out.println(date.isAfter(indp));
			
			System.out.println(indp.isBefore(date));
		
		
		LocalTime  time1 = LocalTime.now();
		System.out.println(time1);
		System.out.println("HH : MM "+ time1.getHour()+ " : "+time1.getMinute());
		
		LocalTime time2 = LocalTime.of(13, 50, 30);
		
		System.out.println(time1.isBefore(time2));
		
		LocalDateTime  dateTime = LocalDateTime.now();
		
		System.out.println(dateTime);
		
		System.out.println(dateTime.getMonth());
		
		LocalDate nextDate =  date.minusMonths(3);  // date.plusDays(5);
		
		System.out.println(nextDate);
		
		
		 LocalDate d =   date.withMonth(12);
		 
		 System.out.println(d);

	}

}
