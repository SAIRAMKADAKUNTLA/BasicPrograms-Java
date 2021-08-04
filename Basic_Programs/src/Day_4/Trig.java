package Day_4;

import java.util.Scanner;

public class Trig {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the angle");
		double angle=scan.nextDouble();
		System.out.println("value of sin("+angle+")="+Math.sin(Math.toRadians(angle)));
		System.out.println("value of cos("+angle+")="+Math.cos(Math.toRadians(angle)));

	}

}
