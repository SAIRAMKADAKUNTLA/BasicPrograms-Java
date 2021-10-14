package com.bridgelabz.classWork;

import java.util.Scanner;

public class ShortestWord {
	public static void getWord(String sentence) {
		String[] words=sentence.split("");
		String shortest=words[0];
		int i;
		for(i=1;i<words.length;i++) {
			if(words[i].length() < shortest.length()) {
				shortest = words[i];
			}
		}
		System.out.println("the shortest word is :"+shortest);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string");
		String sentence=input.next();
		getWord(sentence);
		input.close();
		

	}

}
