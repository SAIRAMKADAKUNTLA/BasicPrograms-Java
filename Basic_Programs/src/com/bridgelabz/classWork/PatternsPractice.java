package com.bridgelabz.classWork;

import java.util.ArrayList;
import java.util.Iterator;

public class PatternsPractice {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("hij");
		list.add("klm");
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String s: list) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		System.out.println(list.get(1));
		list.add("sai");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(2,"hij");
		System.out.println(list);
		ArrayList<String>list1=new ArrayList<String>();
		list1.addAll(list);
		System.out.println("-----------------------------");
		System.out.println(list1);
		list1.set(0,"xyz");
		System.out.println(list1);
		
	}

	}


