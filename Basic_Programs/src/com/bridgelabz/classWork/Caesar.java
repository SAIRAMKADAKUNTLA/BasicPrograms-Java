package com.bridgelabz.classWork;

import java.util.Scanner;

public class Caesar {
	static String alphabets="abcdefghijklmnopqrstuvwxyz";
	public static void getCaesarOfEncryption(String text,int key) {
		String result ="";
		int i;
		for(i=0;i<text.length();i++) {
			int index=alphabets.indexOf(text.charAt(i));
			int formulae=(index+key)%26;
			char ch=alphabets.charAt(formulae);
			result += ch;
		}
		result = result.toUpperCase();
		System.out.print("the cipher text of encryption is :: "+result);
	}
	public static void getCaesarOfDescryption(String text,int key) {
		String result="";
		int i;
		for(i=0;i<text.length();i++) {
			int index=alphabets.indexOf(text.charAt(i));
			int formulae=(index-key)%26;
			char ch=alphabets.charAt(formulae);
			result += ch;
		}
		result=result.toUpperCase();
		System.out.print("  the cipher text of description is :: "+result);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string");
		String text=input.next();
		text=text.toLowerCase();
		System.out.println("enter the key");
		int key=input.nextInt();
		getCaesarOfEncryption(text,key);
		getCaesarOfDescryption(text,key);

	}

}
