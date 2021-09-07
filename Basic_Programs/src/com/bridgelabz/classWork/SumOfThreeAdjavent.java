package com.bridgelabz.classWork;

import java.util.Scanner;

public class SumOfThreeAdjavent {

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
		getMaxSum(array,length);

	}
	public static void getMaxSum(int[] array,int length) {
		int sum=0;
		int max=0;
		
		int i;
		for(i=0;i+2<length;i++) {
			sum=array[i]+array[i+1]+array[i+2];
			System.out.println(array[i]+","+array[i+1]+","+array[i+2]+" = "+sum);
		}
		if(sum>max) {
			max=sum;
			System.out.println("maximum sum is:"+max);
		}
	}

}
