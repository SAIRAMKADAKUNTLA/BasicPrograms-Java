package com.bridgelabz.day_6;

import java.util.Scanner;

public class RangePrime {

	public static void main(String[] args) {
		System.out.print("Enter any range numbers:");
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt(); 
		scanner.close();
		Range(start,end);
	}
	public static void Range(int start,int end) {
		int i,j;
		System.out.print("the range of prime numbers between "+start+"&"+end+"=");
		for(i=start;i<=end;i++) {
			for(j=2;j<=i;j++) {
				if(i%j == 0)
					break;				
			}
			if(i==j)
				System.out.print(j+" ");
		}
	}

}
