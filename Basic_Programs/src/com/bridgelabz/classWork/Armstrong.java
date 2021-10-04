package com.bridgelabz.classWork;

import java.util.Scanner;

public class Armstrong {
	public static void getArmstrong(int start,int end) {
		System.out.println("the Armstrong numbers between "+start+" and "+end+" is ");
		for(int i=start;i<end;i++) {
			int num,rem,sum=0;
			num=i;
			while(num != 0) {
				rem=num%10;
				sum=sum + (rem * rem * rem);
				num=num/10;
			}
			if(sum == i) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the start value");
		int start=input.nextInt();
		System.out.println("enter the end value");
		int end=input.nextInt();
		getArmstrong(start,end);

	}

}
