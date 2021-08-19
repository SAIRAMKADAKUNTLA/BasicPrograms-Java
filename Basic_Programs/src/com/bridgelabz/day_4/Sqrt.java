package com.bridgelabz.day_4;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		System.out.print("Enter any number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); 
		scanner.close();
		System.out.println("Square root of "+ number+ " is: "+GetSqrt(number));
	}
	public static double GetSqrt(int number) {
		double temp=0;
		double mid=number/2;
		do {
			temp = mid;
			mid = (temp + (number / temp)) / 2;
		} while ((temp - mid) != 0);

		return mid;
	    		
	}
}



