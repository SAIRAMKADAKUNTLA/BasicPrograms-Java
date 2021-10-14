package com.bridgelabz.classWork;

public class GenericsBubbleSort<T extends Comparable<T>> {
	public void bubble(T[] arr) {
		int i,j;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if((arr[i].compareTo(arr[j])) > 0) {
					T temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		GenericsBubbleSort<Integer>gb=new GenericsBubbleSort<>();
		Integer[] arr= {5,7,3,9,11,8};
		gb.bubble(arr);
		System.out.println();
		GenericsBubbleSort<String>gs=new GenericsBubbleSort<>();
		String[] str= {"aa","gg","vv","ff","bb"};
		gs.bubble(str);

	}

}
