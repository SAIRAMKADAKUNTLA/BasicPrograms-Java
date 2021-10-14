package com.bridgelabz.classWork;

import java.time.LocalDate;

public class LocalDateOfMonth {

	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		System.out.println("the current date is : "+currentDate);
		int currentDay=currentDate.getDayOfMonth();
		System.out.println("the current day is : "+currentDay);
		int currentMonth=currentDate.getMonthValue();
		System.out.println("the current month is : "+currentMonth);
		int maxDays=currentDate.lengthOfMonth();
		System.out.println("maximum days is : "+maxDays);
	}
}
