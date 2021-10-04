package com.bridgelabz.classWork;

import java.util.Scanner;

public class Factorial {
	public static void usingIteration(int number) {
		int i,result=1;
		for(i=1;i<=number;i++) {
			result = result*i;
		}
		System.out.println("the factorial of "+number+" = "+result);
	}
	public static long usingRecursion(int number) {
		if(number <=  1) {
			return 1;
		}
		else {
			return number * usingRecursion(number-1);
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter any number");
		int number=input.nextInt();
		System.out.println("*****using the iteration*****");
		usingIteration(number);
		System.out.println("*****using the recursion*****");
		System.out.println("the factorial of "+number+" = "+usingRecursion(number));
	}

}
