package com.bridgelabz.classWork;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
		reverse(number);

	}
	public static void reverse(int number) {
	int reverse=0;
	while(number != 0) {
		int remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
	}
	System.out.println("the reverse of "+number+" = "+reverse);
	}

}
