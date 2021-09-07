package com.bridgelabz.classWork;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string");
		String str=scan.next();
		getUnique(str);

	}
	public static void getUnique(String str) {
		String unique="";
		String common="";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
				common += str.charAt(i);
				}					
			}
			unique+=common.charAt(i);
		}
		unique=unique.replaceAll(unique, "");
		System.out.println("unique characters "+unique);
	}

}
