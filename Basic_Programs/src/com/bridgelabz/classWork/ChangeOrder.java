package com.bridgelabz.classWork;

import java.util.Scanner;

public class ChangeOrder {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=input.nextInt();
		int[] array=new int[length];
		System.out.println("enter the elements");
		int i;
		for( i=0;i<length;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("enter the number");
		int num=input.nextInt();
		getOrder(array,num);

	}
	public static void getOrder(int[] array,int num) {
		int i,j;
		int left=0;
		int right=0;
		System.out.println("the required order is");
		for(i=num;i<array.length;i++) {
			left=array[i];
			System.out.print(left+" ");
		}
		for(j=0;j<num;j++) {
			right=array[j];
			System.out.print(right+" ");
		}
	}

}
