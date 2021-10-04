package com.bridgelabz.day_12;

import java.util.Scanner;

public class StandardInput {
	public static boolean isEmpty(int[] array) {
		if(array != null) {
			return false;
		}
		return true;
	}
	public static int[] readAllInt(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
		return array;
	}
	public static double[] readAllDouble(double[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		return array;
	}
	public static String readString(String array) {
		return array;
	}
	public static int readint(int num) {
		return num;
	}
	public static double readDouble(double num) {
		return num;
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
		if(isEmpty(arr)) {
			System.out.println("array is empty");
		}
		else {
			System.out.println("array is not empty");
		}
		System.out.println("array is:");
		readAllInt(arr);
		System.out.println("enter the string");
		String str=input.next();
		 readString(str); 
		 System.out.println("enter the number");
		 int num=input.nextInt();
		 readint(num);
		 System.out.println(num);
		

	}

}
