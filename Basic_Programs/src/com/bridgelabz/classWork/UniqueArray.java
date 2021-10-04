package com.bridgelabz.classWork;

import java.util.Scanner;

public class UniqueArray {
	
	public static <T> void getUnique(T[] array) {
		int i,j;
		int length=array.length;
		for(i=0;i<length-1;i++) {
			for(j=i+1;j<length;j++) {
				if(array[i] == array[j]) {
					array[j] = array[length-1];
					length--;
				}
			}
		}
		System.out.print("array without repeated elements ");
		for(i=0;i<length;i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Integer[] array= {20,20,30,40,30,50,60};
		String[] string= {"sai","sai","sai","ram","hello","ram","hello"};
		getUnique(array);
		getUnique(string);

	}

}
