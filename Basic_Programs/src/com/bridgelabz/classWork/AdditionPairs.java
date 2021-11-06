package com.bridgelabz.classWork;

public class AdditionPairs {
	public static void getpairs(int[] arr,int target) {
		int i,j;
		int temp=0;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("array in ascending order is:");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					System.out.println("\n Pair found "+arr[i]+","+arr[j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr={23,56,12,26,45,35};
		int target=68;
		getpairs(arr,target);

	}

}
