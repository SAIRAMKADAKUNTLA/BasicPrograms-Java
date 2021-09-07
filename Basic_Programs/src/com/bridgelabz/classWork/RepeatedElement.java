package com.bridgelabz.classWork;

import java.util.Scanner;

public class RepeatedElement {
	public static void getRepeated(int[] arr1,int[] arr2) {
		int i,j;
		System.out.println("the repeated elements are : ");
		for(i=0;i<arr1.length;i++) {
			for(j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array ");
		int length=input.nextInt();
		int[] arr1=new int[length];
		System.out.println("enter the elements of array one");
		int i;
		for( i=0;i<length;i++) {
			arr1[i]=input.nextInt();
		}
		int[] arr2=new int[length];
		System.out.println("enter the elements of array two");
		int j;
		for( j=0;j<length;j++) {
			arr2[j]=input.nextInt();
		}
		getRepeated(arr1,arr2);
	}

}
