package com.bridgelabz.classWork;

import java.util.Scanner;

public class PositionOfString {
	public static void getPosition(String str) {
		char c;
		for(c='a';c<='z';c++) {
			System.out.print(c+" ");
			int result=str.indexOf(c, 0);
			System.out.print("="+result+" ");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string");
		String str=input.next();
		getPosition(str);

	}

}
