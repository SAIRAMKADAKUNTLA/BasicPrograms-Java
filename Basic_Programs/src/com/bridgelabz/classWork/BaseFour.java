package com.bridgelabz.classWork;

import java.util.Scanner;

public class BaseFour {
	int decimal=0;
	public void GetBase(int number) {
		int length=String.valueOf(number).length();
		for(int i=0;i<=length-1;i++) {
			if(number==0) {
				break;
			}
			else {
				int temp=number%10;
				decimal+=(int)(Math.pow(4, i))*temp;
				number=number/10;
				System.out.println(decimal);
			}		
		}
		System.out.println("the decimal is:"+decimal);
	}
	public static void main(String[] args) {
		BaseFour b=new BaseFour();
		System.out.println("enter number");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		b.GetBase(number);		
	}

}
