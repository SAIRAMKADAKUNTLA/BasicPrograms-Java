package com.bridgelabz.day_7;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.print("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		getFactors(number);

	}
	public static void getFactors(int number) {
		int i;
		System.out.print("the prime factors are: ");
		for(i=2;i<=number;i++) {
			while(number%i == 0) {
				System.out.print(i+" ");
				number=number/i;
			}
		}
	}

}
