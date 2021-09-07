package com.bridgelabz.classWork;

import java.util.Scanner;

public class MultiplyArray {
	public void getOrder() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of elements");
		int length=scan.nextInt();
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			System.out.println("enter "+(i+1)+" element");
			arr[i]=scan.nextInt();
		}
		System.out.println("the array is");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		int first=arr[0];
		System.out.println("required output is");
		System.out.println("enter the elements");
		for(int i=1;i<length;i++) {	
			int second=arr[i]*first;
			System.out.print(" "+second);
			first=second;
		}

	}

	public static void main(String[] args) {
		MultiplyArray ma=new MultiplyArray();
		ma.getOrder();

	}

}
