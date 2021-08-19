package com.bridgelabz.day_3;

public class RandomArray {
	public void Check() {
		double[] arr=new double[5]; 
		for(int i=0;i<arr.length;i++) {
			arr[i]=(double) (Math.random()*1);
			System.out.println(arr[i]);
		}
		double count=0;
		double sum=0;
		double min=arr[0];
		double max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
			sum+=arr[i];
			count++;
		}
		System.out.println("min is:"+min);
		System.out.println("max is:"+max);
		System.out.println("average is:"+sum/count);
	}

	public static void main(String[] args) {
		RandomArray ra=new RandomArray();
		ra.Check();

	}

}
