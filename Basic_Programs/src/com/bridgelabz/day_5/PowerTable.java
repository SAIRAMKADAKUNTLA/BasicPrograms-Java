package com.bridgelabz.day_5;

import java.util.Scanner;

public class PowerTable {
	public void Table(int number) {
		int result=0;
		for(int i=1;i<=number;i++) {
			result=(int)(Math.pow(2, i));
			System.out.println("2^"+i+"="+result);
		}
	}

	public static void main(String[] args) {
		PowerTable power=new  PowerTable();
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		power.Table(number);
		// TODO Auto-generated method stub

	}

}
