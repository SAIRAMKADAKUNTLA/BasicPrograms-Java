package com.bridgelabz.day_2;

public class RandomSum {
	public void Sum() {
		int first=(int) (Math.random() * 6 + 1);
		int second=(int) (Math.random() * 6 + 1);
		int result=first+second;
		System.out.println("first:"+first+" "+"second:"+second+" "+"sum is:"+result);
	}

	public static void main(String[] args) {
		RandomSum get=new RandomSum();
		get.Sum();

	}


}
