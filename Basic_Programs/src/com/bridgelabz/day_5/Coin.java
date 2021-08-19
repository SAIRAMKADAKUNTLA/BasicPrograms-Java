package com.bridgelabz.day_5;

import java.util.Scanner;

public class Coin {
	public void Percent(int total_Times) {
		double heads=0;
		double tails=0;
		for(int i=1;i<=total_Times;i++) {
			if(Math.random() < 0.5) 
				heads++;
			else 
				tails++;
		}
		System.out.println("percentage of heads="+heads/total_Times*100);
		System.out.println("percentage of tails="+tails/total_Times*100);
	}

	public static void main(String[] args) {
		Coin c=new Coin();
		System.out.println("enter number of times to flip coin");
		Scanner scan=new Scanner(System.in);
		int total_Times=scan.nextInt();
		c.Percent(total_Times);
		// TODO Auto-generated method stub

	}

}
