package com.bridgelabz.day_14;

import java.util.Scanner;

public class BubbleSort {
	public static void sortingAscending(int[] array) {
		int i,j;
		int temp=0;
		for(i=0;i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[i] > array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.print("array in ascending order is:");
		for(i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
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
		sortingAscending(arr);
	}

}
