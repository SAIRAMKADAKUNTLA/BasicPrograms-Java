package com.bridgelabz.day_18;

import java.util.Scanner;

public class DeckOfCards {
	public static void shuffleCards(int numOfCards,int numOfPlayers) {
		String[] shape= {"Spade","Diamond","Hearts","Clubs"};
		String[] num= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int totalLength=shape.length * num.length;
		String[] deck= new String[totalLength];
		for(int i=0;i<=shape.length;i++) {
			for(int j=0;j<=num.length;j++) {
				deck[i]=shape[i] + " " + num[j];
			}
		}
		for(int i=0;i<=totalLength;i++) {
			int rand=(int)Math.random()*(totalLength);
			String temp=deck[rand];
			deck[rand]=deck[i];
			deck[i]=temp;
		}
		for(int i=0;i<numOfCards*numOfPlayers;i++) {
			System.out.println(deck[i]);
			if(i % numOfCards == numOfPlayers - 1) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of cards");
		int numOfCards=input.nextInt();
		System.out.println("enter the number of players");
		int numOfPlayers=input.nextInt();
		shuffleCards(numOfCards,numOfPlayers);
	}

}
