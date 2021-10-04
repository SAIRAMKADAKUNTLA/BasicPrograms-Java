package com.bridgelabz.day_13;

import java.util.Scanner;

public class BinarySearchString {
	public static int getElement(String[] array,String search) {
		int min=0;
		int max=array.length-1;
		while(min <= max) {
			int mid=min+max/2;
			if(array[mid].equals(search)) {
				return mid;
			}
			else if(array[mid].compareTo(search) < 0) {
				min=mid+1;
			}
			else {
				max=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=input.nextInt();
		String[] arr=new String[length];
		System.out.println("enter the elements");
		int i;
		for( i=0;i<length;i++) {
			arr[i]=input.next();
		}
		System.out.println("enter the element to search");
		String search=input.next();
	    System.out.println("the index of element is "+getElement(arr,search));
	}

}
