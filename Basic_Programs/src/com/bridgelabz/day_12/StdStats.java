package com.bridgelabz.day_12;

import java.util.Scanner;

public class StdStats {
	public static double max(double[] array) {
		double maximum=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i] > maximum) {
				maximum=array[i];
			}
		}
		return maximum;
	}
	public static double min(double[] array) {
		double minimum=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i] < minimum) {
				minimum=array[i];
			}
		}
		return minimum;
	}
	public static double mean(double[] array) {
		int sum=0;
		int meann=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		meann=sum/array.length;
		return meann;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=input.nextInt();
		double[] arr=new double[length];
		System.out.print("max number is : ");
		int i;
		for( i=0;i<length;i++) {
			arr[i]=input.nextDouble();
		}
		System.out.print("max number is : "+max(arr));
		System.out.print("min number is : "+min(arr));
		System.out.print("mean is : "+mean(arr));
	}

}
