package com.bridgelabz.classWork;

import java.util.Scanner;

public class RearrangeOrder {
	public static void getOrder(int[] arr,int length) {
		int i,j;
		int temp=0;
		for(i=0;i<length;i++) {
			for(j=i+1;j<length;j++) {
				if(arr[i] > arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("array in ascending order is:");
		for(i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		int mid=length/2;
		System.out.print("array in required order is:");
		System.out.print(arr[mid]+" ");
		for(i=1;i+i<length;i++) {
			System.out.print(arr[mid-i]+" "+arr[mid+i]+" ");
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
		getOrder(arr,length);

	}
}
