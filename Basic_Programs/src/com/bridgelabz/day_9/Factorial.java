package com.bridgelabz.day_9;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
		getFactorial(number);

	}
	public static long getFactorial(int number) {
		int result=1;
		int i;
		for(i=1;i<=number;i++) {
			result =result*i;
			System.out.print(i+"*");
		}
		System.out.print("="+result);
		return result;
	}

}
