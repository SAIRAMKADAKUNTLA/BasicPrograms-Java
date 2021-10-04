package com.bridgelabz.classWork;

import java.util.Scanner;

public class BinarySearch {
	public static int[] getSorted(int[] binary) {
		int i,j;
		int temp=0;
		int length=binary.length;
		for(i=0;i<length;i++) {
			for(j=i+1;j<length;j++) {
				if(binary[i]>binary[j]) {
					temp=binary[i];
					binary[i]=binary[j];
					binary[j]=temp;
				}
			}		
		}
		return binary;
		}
	public static int getIndex(int[] binary,int search) {
		int first=0;
		int last=binary.length;
		int mid=first+last/2;
		while(first <= last) {
			if(binary[mid] == search) {
				return mid;
			}
			if(binary[mid] < search) {
				first=mid+1;
			}
			else {
				last=mid-1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=input.nextInt();
		int[] binary=new int[length];
		System.out.println("enter the elements");
		int i;
		for( i=0;i<length;i++) {
			binary[i]=input.nextInt();
		}
		getSorted(binary);
		System.out.println("the sorted array is:");
		for(i=0;i<length;i++) {
			System.out.print(binary[i]+" ");
		}
		System.out.println("enter the element to get index of it");
		int search=input.nextInt();
		int result=getIndex(binary,search);
		if(result == -1) {
			System.out.println("element not found");
		}
		else {
			System.out.println("element found at index : "+result);
			
		}
	}

}
