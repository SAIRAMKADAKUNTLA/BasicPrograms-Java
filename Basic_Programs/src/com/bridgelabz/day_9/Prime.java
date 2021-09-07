package com.bridgelabz.day_9;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
		if(isPrime(number)) {
			System.out.println(number+" is a prime number");
		}
		else
			System.out.println(number+" is not a prime number");
		}
	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
