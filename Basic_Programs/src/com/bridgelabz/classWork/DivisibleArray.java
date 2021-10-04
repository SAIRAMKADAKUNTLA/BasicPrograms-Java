package com.bridgelabz.classWork;

import java.util.Scanner;

public class DivisibleArray {
	public static void getDivisible(int[] arr,int length,int target) {
		int i;
		System.out.print("the divisible numbers are == ");
		for(i=0;i<length;i++) {
			if(arr[i] % target == 0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=input.nextInt();
		int[] arr=new int[length];
		System.out.println("enter the elements");
		int i;
		for( i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("the array is");
		for( i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("enter the target value");
		int target=input.nextInt();
		getDivisible(arr,length,target);

	}

}
