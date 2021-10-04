package com.bridgelabz.classWork;

import java.util.Scanner;

public class CheckPalPrime {
	public static void checkNumber(int start,int end) {
		int rem,i;
		int rev;
		int number;
		int count;
		int temp;
		for(number=start;number<=end;number++) {
			temp=number;
			count=0;
			rev=0;
			while(temp > 0) {
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
				for(i=1;i<=number;i++) {
					if(number % i == 0) {
						count++;
					}
				}
				if(count == 2 && number == rev) {
					System.out.print(number+" ");
				}
		}
	}
	
	


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the start number");
		int start=input.nextInt();
		System.out.println("enter the end number");
		int end=input.nextInt();
		checkNumber(start,end);
	}

}
