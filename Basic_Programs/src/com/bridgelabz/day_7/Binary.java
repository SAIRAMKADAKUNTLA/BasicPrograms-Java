package com.bridgelabz.day_7;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		System.out.print("Enter any number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		getBinary(number);

	}
	public static void getBinary(int number) {
		int temp;
		temp=number;
		String binaryy="";
		while(temp>0) {
			int r=temp%2;
			temp=temp/2;
			binaryy=r+binaryy;
		}
		System.out.print("the binary of:"+number+" is "+binaryy);
	}

}
