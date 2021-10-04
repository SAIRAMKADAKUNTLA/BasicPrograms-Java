package com.bridgelabz.day_13;

import java.util.Scanner;

public class BinarySearchInteger {
	public static int getIndex(int[] array,int search) {
		int min=0;
		int max=array.length-1;
		while(min <= max) {
			int mid=min+max/2;
			if(array[mid] == search) {
				return mid;
			}
			else if(array[mid] < search) {
				max=mid-1;
			}
			else {
				min=mid+1;
			}
		}
		return -1;
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
		System.out.println("enter the element to search index");
		int search=input.nextInt();
		System.out.println("enter the element at index : "+getIndex(arr,search));
	}

}
