package com.bridgelabz.day_4;

import java.util.Scanner;

public class TemperatureConversion {
	public void Convert() {
		Scanner scan=new Scanner(System.in);
		System.out.println("1.Celcius to fahrenheit,2.fahrenheit to Celcius");
		int choice=scan.nextInt();
		System.out.println("enter the temperature ");
		double temperature=scan.nextDouble();
		switch(choice) {
		case 1:
			double result1=(temperature*9/5)+32;
			System.out.println("temerature in fahrenheit is: "+result1);
			break;
		case 2:
			double result2=(temperature-32)*5/9;
			System.out.println("temerature in celcius is: "+result2 );
			break;
		default:
			System.out.println("INVALID VALUE" );
			break;
				
		}
		
	}

	public static void main(String[] args) {
		TemperatureConversion tc=new TemperatureConversion();
		tc.Convert();

	}

}
