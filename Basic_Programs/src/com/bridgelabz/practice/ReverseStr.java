package com.bridgelabz.practice;

import java.util.Scanner;

public class ReverseStr {
	public void revrse() {
		int r=0;
		int rev=0;
		int temp=0;
		int num=6446;
		temp=num;
		while(num != 0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(temp == rev) {
			System.out.print("it is a palindrome");
		}
		else {
			System.out.print("not a palimdrome");
		}
		
	}
	public void Union() {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {5,6,7,8,9};
		int a1=arr1.length;
		int a2=arr2.length;
		int i=0;
		int j=0;
          while(i<a1 && j<a2) {
				if(arr1[i] < arr2[j]) {
					System.out.print(+arr1[i++]);
				}
				else if (arr2[j] < arr1[i])
				{
					System.out.print(+arr2[j++]);	
				}
				else {
					System.out.print(+arr2[j++]);
					i++;
				}
			}
          while(i<a1) {
        	  System.out.print(+arr1[i]);
        	  i++;
          }
          while(j<a2) {
        	  System.out.print(+arr2[j]);
        	  j++;
          }
	}
	public void Get() {
		String result="";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any string");
		String str=scan.next();
		for(int i=str.length()-1;i>=0;i--) {
			result=result+str.charAt(i);
		  }
		System.out.println("result is  "+result);
	}
	public void Add() {
		int sum=0,temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int n=scan.nextInt();
		while(n != 0) {
			temp=n%10;//
			n=n/10;
			sum=sum+temp;
		}

		System.out.println("result is  "+sum);
	}
	public void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	public void odd() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int number=scan.nextInt();
		int m=number/2;
		for(int i=2;i<=m;i++) {
				if(number % i == 0) 
					System.out.println("not a prime");
				
				else 
					System.out.println("is a prime"+i);			
		}

		
	}
	public int third(int[] arr) {
		int l=arr.length;
		int i,j;
		int temp=0;
		for(i=0;i<l;i++) {
			for(j=i+1;j<l;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");	
		}
		System.out.println("the third largest is:");
		System.out.print(arr[l-3]);
		return arr[l-3];
	}
	public void similar(int[] arr) {
		int i;
		int j=0;
		int[] temp=new int[arr.length];
		for(i=0;i<arr.length;i++) {
				if(arr[i] != arr[i+1]) {
					temp[j++]=arr[i];
				}
			}
		temp[j++]=arr[arr.length-1];
		System.out.println("the array is:");
		for ( i=0; i<j; i++){  
            arr[i] = temp[i];
            System.out.println(arr[i]+" ");
        }  
          
	}

	public static void main(String[] args) {
		ReverseStr r=new ReverseStr();
		//r.Get();
		//r.Add();
		//r.swap(5, 6);
		//r.odd();
		//r.Union();
		//r.revrse();
		int[] arr= {4,8,23,12,23,12};
		//r.third(arr);
		//r.similar(arr);

	}

}
