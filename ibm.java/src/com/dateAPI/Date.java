package com.dateAPI;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//question 1
		LocalDate localDate = LocalDate.now(); 
		System.out.println(localDate); 
		int day = localDate.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day); 
		int dayafter15days = localDate.get(ChronoField.DAY_OF_MONTH)+15;
		System.out.println(dayafter15days); 
		//question 2
		LocalTime localTime = LocalTime.now(); 
		System.out.println(localTime);
		LocalTime localTime1 = LocalTime.of(15, 00, 10); 
		System.out.println(localTime1);
	//	Duration d1 = Duration.between(localTime,localTime1); 
		
		
		//question 3
		int day1 = localDate.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day1);
		int month = localDate.get(ChronoField.MONTH_OF_YEAR); 
		System.out.println(month);
		
		LocalDate localDate1 = LocalDate.of(2020, 2, 29); 
		//question 4
		ZoneId romezone=ZoneId.of("Europe/Rome");
		LocalTime lt=LocalTime.now(romezone);
		System.out.println( lt);
		//question 6
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1 = LocalDate.now();  
		System.out.println(date1);
		String formattedDate = date1.format(formatter); 
		System.out.println(formattedDate);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy ");
		String formattedDate2 = date1.format(formatter2); 
		System.out.println(formattedDate2);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh:mm:ss");
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		String formattedTime1 = time1.format(formatter1);
		System.out.println(formattedTime1);
	}

}
