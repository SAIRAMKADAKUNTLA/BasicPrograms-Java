package com.bridgelabz.classWork;

import java.util.Scanner;

public class Pattern {
	public static void pyramidPattern(int rows) {
		int space,i,j;
		for(i=1;i<=rows;i++) {
			for(space=1;space<=rows-i;space++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void getPattern(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=input.nextInt();
		pyramidPattern(rows);
		getPattern(rows);
	}

}
