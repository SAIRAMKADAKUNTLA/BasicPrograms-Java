package com.bridgelabz.day_9;

import java.util.Scanner;

public class MathFunction {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
		harmonic(number);
		

	}
	public static double harmonic(int number) {
		double sum=0.0;
		for(int i=1;i<=number;i++) 
			sum += 1.0/i;
		System.out.println(sum);
			return sum;
	}

}
