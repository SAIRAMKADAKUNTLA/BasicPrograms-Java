package com.bridgelabz.classWork;

import java.util.Scanner;

public class EvenOrOdd {
	public static void checkNumber(int number) {
		if((number/2)*2 == number) {
			System.out.println(+number+" is even");
		}
		else {
			System.out.println(+number+" is odd");
		}
	}
	public static int check(int number) {
		return (number & 1);
		
	}
	public static void checkNum(int number) {
		while(number >= 2) {
			number=number-2;
		}
		if(number == 0) {
			System.out.println(" is even");
		}
		else {
			System.out.println(" is odd");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
//		checkNumber(number);
//		if(check(number) == 0) {
//			System.out.println(+number+" is even");
//		}
//		else {
//			System.out.println(+number+" is odd");
//		}
		checkNum(number);

	}

}
