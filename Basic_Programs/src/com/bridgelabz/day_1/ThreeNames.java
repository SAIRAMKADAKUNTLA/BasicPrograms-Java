package com.bridgelabz.day_1;

import java.util.Scanner;

public class ThreeNames {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Name one");
		String nameOne=scanner.nextLine();
		System.out.println("Enter the Name two");
		String nameTwo=scanner.nextLine();
		System.out.println("Enter the Name three");
		String nameThree=scanner.nextLine();
		System.out.println(nameThree+" "+nameTwo+" "+nameOne);

	}

}
