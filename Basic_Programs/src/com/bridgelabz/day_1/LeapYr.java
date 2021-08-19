package com.bridgelabz.day_1;

import java.util.Scanner;

public class LeapYr {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=scan.nextInt();
		if(((year%4==0) && (year%100!=0)) || (year%400==0) ) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}

	}

}
