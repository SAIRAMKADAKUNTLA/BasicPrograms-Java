package com.bridgelabz.classWork;

import java.util.Scanner;

public class arraySorting {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=input.nextInt();
		int[] array=new int[length];
		int i;
		for( i=0;i<length;i++) {
			System.out.println("enter the " +(i+1)+ " element");
			array[i]=input.nextInt();
			sort(array);
		}

	}
	public static void sort(int[] array) {
		int len=array.length;
		int i,j;
		int temp=0;
		for(i=0;i<len;i++) {
			for(j=i+1;j<len;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					System.out.println(array[i]+" ");
					array[i]=array[j];
					array[j]=temp;					
				}
			}
		}
	}

}
