package com.bridgelabz.day_6;

import java.util.Random;
import java.util.Scanner;

public class RollDie {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
		CheckMax(number);
		

	}
	public static void CheckMax(int number_Of_Times) {
		Random rand=new Random();
		int count=0;
		int max=0;
		int check;
		for(int i=1;i<=number_Of_Times;i++) {
			check=rand.nextInt(6);
			check++;
			System.out.print(check+" ");
		}
	}

}
