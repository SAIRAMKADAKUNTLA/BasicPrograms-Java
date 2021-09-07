package com.bridgelabz.classWork;

import java.util.Scanner;

public class GoodString {
	public static boolean checkString(String str) {
		int i,j;
		for(i=0;i<str.length();i++) {
			for(j=i+1;j<str.length();j++) {
				if(str.charAt(i) != str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a string");
		String str=input.next();
		if(checkString(str)) {
			System.out.println("It is a good string");
		}
		else {
			System.out.println("It is not a good string");
		}
	}

}
