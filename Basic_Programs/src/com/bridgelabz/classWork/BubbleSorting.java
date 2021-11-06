package com.bridgelabz.classWork;

public class BubbleSorting {
	public static void getSortedArray(int[] array) {
		int i,j;
		for(i=0;i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				int temp=0;
				if(array[i] > array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int k=0;k<array.length;k++) {
			System.out.print(array[k]+" ");
		}
	}

	public static void main(String[] args) {
		int[] array= {9,7,6,5,4,3};
		getSortedArray(array);

	}

}
