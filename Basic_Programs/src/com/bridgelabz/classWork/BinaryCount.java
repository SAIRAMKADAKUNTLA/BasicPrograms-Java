package com.bridgelabz.classWork;

import java.util.Scanner;

public class BinaryCount {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the array length");
		int length=input.nextInt();
		int[] arr=new int[length];
		System.out.println("enter the elements");
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		findCount(arr);

	}
	public static void findCount(int[] arr) {
		int count=0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 1) {
				count++;
				max=Math.max(count, max);
			}
			else {
				count=0;
			}
		}
		System.out.println("the maximum consecutives are " +max);
				
	}
	
}
