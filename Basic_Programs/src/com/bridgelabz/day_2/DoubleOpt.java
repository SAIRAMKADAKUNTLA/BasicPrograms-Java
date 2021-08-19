package com.bridgelabz.day_2;

import java.util.Scanner;

public class DoubleOpt {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("enter a value");
		  double a=scan.nextDouble();
		  System.out.println("enter b value");
		  double b=scan.nextDouble();
		  System.out.println("enter c value");
		  double c=scan.nextDouble();
		  double opOne=a+b*c;
		  double opTwo=a*b+c;
		  double opThree=c+a/b;
		  double opFour=a%b+c;
		  System.out.println("first op:"+opOne+" "+"second op:"+opTwo+" "+"third op:"+opThree
				  +" "+"fourth op:"+opFour);

	}

}
