package com.bridgelabz.practice;

public class GenericMethod {
	public static <T> void print(T value) {
		System.out.println("the value is:"+value);
	}

	public static void main(String[] args) {
		print("generics");
		print(100);
		print('A');
	}

}
