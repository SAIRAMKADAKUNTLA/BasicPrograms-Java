package com.bridgelabz.day_6;

public class RepeatedNum {

	public static void main(String[] args) {
		int[] arr=new int[100];
		int[] temp=new int[100];
		for(int i=0;i<arr.length;i++) {
		}
		Repeated(arr);
		// TODO Auto-generated method stub

	}
	public static void Repeated(int[] arr) {
		int i,j;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
