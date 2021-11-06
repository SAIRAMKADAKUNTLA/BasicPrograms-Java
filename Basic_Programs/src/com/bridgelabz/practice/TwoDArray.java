package com.bridgelabz.practice;

public class TwoDArray {

	public static void main(String[] args) {
		int[] arr1= {3,4,5};
		int[][] arr=new int[3][3];
		int i=0,j=0;
		for(i=0;i<arr1.length;i++) {
			for(j=0;j<arr1.length;j++) {
				if(i == j) {
					arr[i][j]=arr1[i];
					
				}
			}
		}
		for(i=0;i<arr1.length;i++) {
			for(j=0;j<arr1.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
