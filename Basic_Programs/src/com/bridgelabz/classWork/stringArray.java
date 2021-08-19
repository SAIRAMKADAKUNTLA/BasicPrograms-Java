package com.bridgelabz.classWork;

import java.util.Scanner;

public class stringArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length");
		int len=input.nextInt();
		String[] str= new String[len];
		System.out.println("enter the elements");
		for(int i=0;i<len;i++) {
			str[i]=input.next();
		}
		getCommon(str);

	}
	public static void getCommon(String[] str) {
		int length=str.length;
		int i,j;
		String common=str[0];
		for(i=0;i<length;i++) {
			if(common.charAt(i) == str[1+i].charAt(i)) {
				System.out.println(common.charAt(i));
			}
		}
	}

}
