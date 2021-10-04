package com.bridgelabz.classWork;

import java.util.Scanner;

interface GetOrder{
	public void getOrder(int[] arr);
}
public class LamdaUsing {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	GetOrder get = (array) ->{
		int[] arr= {2,4,5,6,7};
		int i,j;
		int temp=0;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("array in ascending order is:");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int mid=arr.length/2;
		System.out.print("array in required order is:");
		System.out.print(arr[mid]+" ");
		for(i=1;i+i<arr.length;i++) {
			System.out.print(arr[mid-i]+" "+arr[mid+i]+" ");
		}
	};
}
}

