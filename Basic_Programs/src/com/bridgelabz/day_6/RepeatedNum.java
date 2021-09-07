package com.bridgelabz.day_6;

import java.util.Scanner;

public class RepeatedNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length");
		int length=input.nextInt();
		int[] arr=new int[length];
		Repeated(arr,length);
		// TODO Auto-generated method stub

	}
	public static void Repeated(int[] arr,int length) {
		int i=1;
		for(i=1;i<=length-1;i++) {
			System.out.print(i+" ");
		}
	}
	
}
