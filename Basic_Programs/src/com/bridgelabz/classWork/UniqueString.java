package com.bridgelabz.classWork;

import java.util.Scanner;

public class UniqueString {
	public static void getUnique(String[] str,int length) {
		int i,j;
		String duplicate=" ";
		String result=" ";
		for(i=0;i<length-1;i++) {
			for(j=i+1;j<length;j++) {
				if(str[i].equals(str[j])) {
					duplicate += str[i]+" ";
				}
			}
		}
		if(str[i] != duplicate) {
			result += str[i];
		}
		System.out.println("duplicates are : "+duplicate);
		System.out.println("required array is : "+result);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=input.nextInt();
		String[] str=new String[length]; 
		System.out.println("enter the elements");
		int i;
		for( i=0;i<length;i++) {
			str[i]=input.next();
		}
		System.out.println("the array is  ");
		for( i=0;i<length;i++) {
			System.out.println(str[i]+" ");
		}
		getUnique(str,length);

	}

}
