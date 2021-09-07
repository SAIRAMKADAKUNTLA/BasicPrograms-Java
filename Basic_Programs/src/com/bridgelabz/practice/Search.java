package com.bridgelabz.practice;

import java.util.Scanner;

public class Search {

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
		System.out.println("enter number");
		int data=input.nextInt();
		binarySearch(array,data,length);

	}
	public static void binarySearch(int[] arr,int data,int n) {
		int left=0;
		int right=n-1;
		int mid=0;
		while(left <= right) {
			mid=left+right/2;
			if(arr[mid] == data) {
				System.out.println("value is found at index "+mid);
			}
			else if(arr[mid] > data) {
				right=mid-1;
			}
			else if(arr[mid] < data) {
				left=mid+1;
			}
		}
		if(left > right) {
			System.out.println("value is not found  ");
		}
		
	}

}
