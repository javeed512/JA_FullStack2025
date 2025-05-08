package com.dates.times;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatsDemo {

	public static void main(String[] args) {


		LocalDate  date =	LocalDate.now();
		
DateTimeFormatter  formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
			String  str =	date.format(formatter);
		
		System.out.println(str);
		
		DateTimeFormatter  myformatter =   DateTimeFormatter.ofPattern("dd-MM-yyyy");

		
		String str2 =	date.format(myformatter);
		
		System.out.println(str2);
		
		  String  input  = "12-01-1990";
	  
		LocalDate dateOfBirth =    LocalDate.parse(input, myformatter);
		
		  System.out.println(dateOfBirth);
		  System.out.println(dateOfBirth.getDayOfWeek());
		
		
	}

}
