package com.bridgelabz.day_2;

import java.util.Scanner;

public class Distance {
	public static void Get() {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("enter x value");
		  double x=scan.nextDouble();
		  System.out.println("enter y value");
		  double y=scan.nextDouble();
		  double distance=Math.sqrt(x*x+y*y);
		  System.out.println("the distance is:"+distance);
	}

	public static void main(String[] args) {
		Distance.Get();

	}

}
