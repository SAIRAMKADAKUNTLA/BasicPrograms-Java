package com.bridgelabz.day_5;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the stake");
		int stake=scan.nextInt();
		System.out.println("enter the trails");
		int trails=scan.nextInt();
		System.out.println("enter the goal");
		int goal=scan.nextInt();
		details(stake,trails,goal);

	}
	public static void details(int stake,int trials,int goal) {
		int bets=0;
		int wins=0;
		for(int i=0;i<trials;i++) {
			int cash=stake;
			while(cash > 0 && cash < goal) {
				bets++;
				if(Math.random() < 0.5) cash++;
				else cash--;
			}
			if(cash == goal) wins++;
		}
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg bets = " + 1.0 * bets / trials);
		
	}

}
