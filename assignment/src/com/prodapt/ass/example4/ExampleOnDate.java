package com.prodapt.ass.example4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExampleOnDate {
	
	public static void main(String[] args) {
		 LocalDate date=LocalDate.now();
		 System.out.println("The current date is "+date);
		 
		 LocalTime time=LocalTime.now();
		 System.out.println("The current time is :"+time);
		 
		 LocalDateTime current=LocalDateTime.now();
		 System.out.println("The current date and time :"+current);
		 
		 DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		 String formatedDateAndTime=current.format(format);
		 System.out.println("Date and time in formatted manner :"+formatedDateAndTime);
		 
		 }

}
