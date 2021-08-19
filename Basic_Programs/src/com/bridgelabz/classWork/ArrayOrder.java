package com.bridgelabz.classWork;

import java.util.Scanner;

public class ArrayOrder {
	public void GetOrder(int[] arr,int number) {
		int i;
		int left=0;
		int right=0;
		System.out.println("the required order is: ");
		for(i=0;i<arr.length;i++) {
			if(number>arr[i]) {
				left=arr[i];
				System.out.print(left+" ");
			}
		}
		for(i=0;i<arr.length;i++) {
			if(number<arr[i]) {
				right=arr[i];
				System.out.print(right+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		ArrayOrder ao=new ArrayOrder();
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
		System.out.println("enter the number");
		int number=input.nextInt();
		ao.GetOrder(arr, number);
	}

}
