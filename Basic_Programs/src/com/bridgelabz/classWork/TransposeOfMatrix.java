package com.bridgelabz.classWork;

import java.util.Scanner;

public class TransposeOfMatrix {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=input.nextInt();
		System.out.println("enter the number of columns");
		int col=input.nextInt();
		int[][] matrix=new int[rows][col];
		int i,j;
		System.out.println("enter the elements");
		for(i=0;i<rows;i++) {
			for(j=0;j<col;j++) {
				matrix[i][j]=input.nextInt();
			}
		}
		System.out.println("the matrix is");
		for(i=0;i<rows;i++) {
			for(j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		int[][] transpose=new int[col][rows];
		for(i=0;i<col;i++) {
			for(j=0;j<rows;j++) {
				transpose[i][j]=matrix[j][i];
			}
		}
		System.out.println("the transpose of matrix");
		for(i=0;i<col;i++) {
			for(j=0;j<rows;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}

}
