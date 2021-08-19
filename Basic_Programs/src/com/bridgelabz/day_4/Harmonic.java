package com.bridgelabz.day_4;

import java.util.Scanner;

public class Harmonic {
	public static double GetSum(double n) {
		System.out.print("the Harmonic series is Hn=");
		double sum=0;		
        for(double i=1;i<=n;i++) {
        	sum = sum+(1/i);
        }
        System.out.print(sum);
        return sum;
	}

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scan=new Scanner(System.in);
		double n=scan.nextDouble();
		Harmonic.GetSum(n);
	}

}
