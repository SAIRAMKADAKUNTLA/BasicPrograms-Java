package com.bridgelabz.classWork;

import java.util.Scanner;

public class Harmonic2dArray {
	public static void getHarmonic(int number) {
		double i,sum=0.0;
		System.out.print("the harmonic series of "+number+" = ");
		for(i=1;i<=number;i++) {
			sum=sum+1/i;
			System.out.print(sum+",");
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
		getHarmonic(number);

	}

}
