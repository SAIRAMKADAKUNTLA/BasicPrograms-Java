package com.bridgelabz.day_6;

import java.util.Random;

public class RollDie {

	public static void main(String[] args) {
		CheckMax(10);
		

	}
	public static void CheckMax(int number_Of_Times) {
		Random rand=new Random();
		int count=0;
		for(int i=1;i<=number_Of_Times;i++) {
			int check=rand.nextInt(6);
			check++;
			System.out.print(check+" ");
			
		}
		

	}

}
