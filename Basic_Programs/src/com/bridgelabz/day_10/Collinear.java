package com.bridgelabz.day_10;

import java.util.Scanner;

public class Collinear {
	public static void isCollinear(double x1,double x2, double x3,double y1,double y2,double y3) {
		double slopeAB=(y2-y1)/(x2-x1);
		double slopeBC=(y3-y2)/(x3-x2);
		double slopeAC=(y3-y1)/(x3-x1);
		System.out.println("AB = "+slopeAB);
		System.out.println("BC = "+slopeBC);
		System.out.println("AC = "+slopeAC);
		if(slopeAB == slopeBC && slopeBC == slopeAC) {
			System.out.println("hence three points are collinear");
		}
		else {
			System.out.println("hence three points are not collinear");
		}
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the x1");
		double x1=input.nextDouble();
		System.out.println("enter the x2");
		double x2=input.nextDouble();
		System.out.println("enter the x3");
		double x3=input.nextDouble();
		System.out.println("enter the y1");
		double y1=input.nextDouble();
		System.out.println("enter the y2");
		double y2=input.nextDouble();
		System.out.println("enter the y3");
		double y3=input.nextDouble();
		isCollinear(x1,x2,x3,y1,y2,y3);
	}

}
