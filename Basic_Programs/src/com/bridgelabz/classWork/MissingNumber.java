package com.bridgelabz.classWork;

import java.util.Scanner;

public class MissingNumber {
	public static void getMissing(int[] sequence) {
		int sum1=0,sum2=0;
		for(int i=0;i<sequence.length;i++) {
			sum1 += sequence[i];
		}
		for(int i=1;i<=sequence.length+1;i++) {
			sum2 += i;
		}
		System.out.println("the missing number is "+(sum2-sum1));
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
		getMissing(arr);
		input.close();
	}
}
