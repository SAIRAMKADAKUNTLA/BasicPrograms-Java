package com.bridgelabz.classWork;

import java.util.Scanner;

public class FirstRepeated {
	public static int getRepeated(int[] array) {
		int length=array.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(array[i] == array[j]) {
					return array[i];
				}
			}
		}
		return -1;
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
		int result=getRepeated(arr);
		if(result == -1) {
			System.out.println("there is no first elements");
		}
		else {
			System.out.println("first repeated element is "+result);
		}
	}

}
