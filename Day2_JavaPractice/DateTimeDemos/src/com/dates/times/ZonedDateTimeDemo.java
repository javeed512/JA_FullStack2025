package com.dates.times;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {

			ZonedDateTime zdate = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
			
			  
			
			System.out.println(zdate);
		
	}

}
