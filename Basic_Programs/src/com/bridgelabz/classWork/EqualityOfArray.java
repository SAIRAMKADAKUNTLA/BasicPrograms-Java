package com.bridgelabz.classWork;

import java.util.Scanner;

public class EqualityOfArray {
	public static String name;
	public static void getEqual(int[] arr1,int[] arr2,int length) {
		int i,j;
		boolean check=false;
		for(i=0;i<length;i++) {
			for(j=0;j<length;j++) {
				if(arr1[i] == arr2[j]) {
					check=true;
				}
			}
		}
		if(check) {
			System.out.println("=====both arrays are  equal=====");
		}
		else {
			System.out.println("======both arrays are not equal=======");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=input.nextInt();
		int[] arr1=new int[length];
		System.out.println("enter the elements of arr1");
		int i;
		for( i=0;i<length;i++) {
			arr1[i]=input.nextInt();
		}
		int[] arr2=new int[length];
		System.out.println("enter the elements of arr2");
		int j;
		for( j=0;j<length;j++) {
			arr2[j]=input.nextInt();
		}
		System.out.print("the array1 is");
		for( i=0;i<length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.print("the array2 is");
		for( j=0;j<length;j++) {
			System.out.print(arr2[j]+" ");
		}
		getEqual(arr1,arr2,length);

	}

}
