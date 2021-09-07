package com.bridgelabz.classWork;

import java.util.Scanner;

public class TwoSumNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=input.nextInt();
		int[] array=new int[length];
		System.out.println("enter the elements");
		int i;
		for( i=0;i<length;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("enter the sum number");
		int number=input.nextInt();
		 getPair(array,number);

	}
	public static void getPair(int[] arr,int number) {
		int i;
		for(i=0;i<arr.length;i++) {
			int sum=arr[i]+arr[i+1];
			if(sum == number) {
				
				
			}
		}
	}

}
