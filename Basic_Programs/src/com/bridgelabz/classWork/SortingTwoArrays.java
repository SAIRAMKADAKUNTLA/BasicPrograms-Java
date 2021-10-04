package com.bridgelabz.classWork;

import java.util.Scanner;

public class SortingTwoArrays {
	public static void getSorted(int[] arrayOne,int[] arrayTwo) {
		int lengthOne=arrayOne.length;
		int lengthTwo=arrayTwo.length;
		int[] merge=new int[lengthOne+lengthTwo];
		int i=0,j=0,k=0;
		int temp;
		while(i < lengthOne) {
			merge[k]=arrayOne[i];
			i++;
			k++;
		}
		while(j < lengthTwo) {
			merge[k]=arrayTwo[j];
			j++;
			k++;
		}
		for(i=0;i<lengthOne+lengthTwo;i++) {
			for(j=i+1;j<lengthOne+lengthTwo;j++) {
				if(merge[i] > merge[j]) {
					temp=merge[i];
					merge[i]=merge[j];
					merge[j]=temp;
				}
			}
		}
		System.out.println("sorting merged array in ascending order is::");
		for(i=0;i<lengthOne+lengthTwo;i++) {
			System.out.print(merge[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=input.nextInt();
		int[] arr1=new int[length];
		System.out.println("enter the elements 0f 1st array");
		int i,j;
		for( i=0;i<length;i++) {
			arr1[i]=input.nextInt();
		}
		int[] arr2=new int[length];
		System.out.println("enter the elements second array");
		for( j=0;j<length;j++) {
			arr2[j]=input.nextInt();
		}
		getSorted(arr1,arr2);

	}

}
