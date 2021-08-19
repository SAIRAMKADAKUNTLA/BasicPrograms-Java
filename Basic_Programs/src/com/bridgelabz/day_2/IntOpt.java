package com.bridgelabz.day_2;

import java.util.Scanner;

public class IntOpt {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		  System.out.println("enter a value");
		  int a=scan.nextInt();
		  System.out.println("enter b value");
		  int b=scan.nextInt();
		  System.out.println("enter c value");
		  int c=scan.nextInt();
		  int opOne=a+b*c;
		  int opTwo=a*b+c;
		  int opThree=c+a/b;
		  int opFour=a%b+c;
		  System.out.println("first op:"+opOne+" "+"second op:"+opTwo+" "+"third op:"+opThree
				  +" "+"fourth op:"+opFour);

	}

}
