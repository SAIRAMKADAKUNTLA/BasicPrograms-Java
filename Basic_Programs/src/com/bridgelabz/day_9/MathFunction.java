package com.bridgelabz.day_9;

import java.util.Scanner;

public class MathFunction {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
		harmonic(number);
		System.out.println("enter the angle");
		double angle=input.nextDouble();
		sin(angle);
		cos(angle);
		binary(number);
		

	}
	public static double harmonic(int number) {
		double sum=0.0;
		for(int i=1;i<=number;i++) 
			sum += 1.0/i;
		System.out.println(sum);
			return sum;
	}
	public static double sin(double angle) {
		double result=0.0;
		result=Math.sin(angle);
		System.out.println(result);
		return result;
	}
	public static double cos(double angle) {
		double result=0.0;
		result=Math.cos(angle);
		System.out.println(result);
		return result;
	}
	public static String binary(int number) {
		String result;
		result=Integer.toBinaryString(number);
		System.out.println(result);
		return result;
	}

}
