package com.prodapt.ass.example1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeAndDate {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		String date = "23-Aug-2020";
		LocalDate localDate = LocalDate.parse(date, formatter);
		System.out.println(localDate);
		System.out.println(formatter.format(localDate));
	}
}
