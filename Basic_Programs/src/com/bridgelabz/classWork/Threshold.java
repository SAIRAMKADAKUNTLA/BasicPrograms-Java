package com.bridgelabz.classWork;

import java.util.Scanner;

public class Threshold {
	public static void main(String[] args) {
		System.out.println("enter the length");
		Scanner scan=new Scanner(System.in);
		int length=scan.nextInt();
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			System.out.println("enter the "+(i+1)+" element");
			arr[i]=scan.nextInt();
		}
		System.out.println("the array is");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("enter the threshold value");
		int t=scan.nextInt();
		int result;
		System.out.println(" the order is");
		for(int j=1;j<arr.length;j++) {
			if(arr[j] < t) {
				result=arr[j];
				System.out.print(result+" ");
			}
		}
	}


}
