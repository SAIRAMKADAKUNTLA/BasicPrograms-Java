package com.bridgelabz.day_10;

import java.util.Scanner;

public class CompountIntrest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the invest");
		int invest=input.nextInt();
		System.out.println("enter the rate");
		int rate=input.nextInt();
		System.out.println("enter the period");
		int period=input.nextInt();
		getValue(invest,rate,period);

	}
	public static double getValue(double invest,double rate,double period) {
		double futureValue=0;
		if(invest > 0 && rate > 0 && period > 0) {
			futureValue=invest*Math.pow((1+rate),period);
		}
		System.out.println("compound intrest is = "+futureValue);
		return futureValue;
	}

}
