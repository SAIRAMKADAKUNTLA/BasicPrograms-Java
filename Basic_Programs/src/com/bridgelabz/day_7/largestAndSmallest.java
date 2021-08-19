package com.bridgelabz.day_7;

import java.util.Scanner;

public class largestAndSmallest {

	public static void main(String[] args) {
		System.out.print("Enter length of array");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		System.out.print("Enter the elements");
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=scanner.nextInt();
		}
		secondSmallest(arr);
		secondLargest(arr);
	}
	public static void secondSmallest(int[] arr) {
		int i,j,temp;
		int l=arr.length;
		for(i=0;i<l;i++) {
			for(j=i+1;j<l;j++) {
				if(arr[i] > arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Second Smallest number is: "+arr[1]);
	}
	public static void secondLargest(int[] arr) {
		int i,j,temp;
		int l=arr.length;
		for(i=0;i<l;i++) {
			for(j=i+1;j<l;j++) {
				if(arr[i] < arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Second largest number is: "+arr[1]);
	}
		
	}


