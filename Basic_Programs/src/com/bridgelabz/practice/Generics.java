package com.bridgelabz.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Generics <T1,T2> {
	T1 a1;
	T2 a2;
	public Generics(T1 a1,T2 a2) {
		this.a1=a1;
		this.a2=a2;
	}
	public void print1() {
		System.out.println(a1);
		System.out.println(a2);
	}

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ram");
		list.add("sai");
		list.add("hyd");
		System.out.println(list);
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(21);
		list1.add(32);
		System.out.println(list1);
		Generics<Integer,String> list3=new Generics<Integer,String>(24,"sairam");
		list3.print1();
		Integer[] arr1= {4,5,6,7};
		Print(arr1);
	}
	public static <T> void Print(T[] array1){
		for(T element : array1) {
			System.out.print(element+" ");
		}
	}

}

