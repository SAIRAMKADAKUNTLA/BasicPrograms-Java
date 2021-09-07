package com.bridgelabz.day_10;

import java.util.Scanner;

public class MinAndMaxInteger {
	public static int getMin(int array[],int length) {
		int i;
		int min=array[0];
		for(i=0;i<length;i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	public static int getMax(int array[],int length) {
		int i;
		int max=array[0];
		for(i=0;i<length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
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
		System.out.println("minimum number is : "+getMin(arr,length));
		System.out.println("maximum number is : "+getMax(arr,length));

	}
	

}
