package com.bridgelabz.day_8;

import java.util.Arrays;
import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=input.next();
		System.out.println("enter second string");
		String str2=input.next();
		if(anagram(str1,str2)) {
			System.out.println("both strings are anagram");
		}
		else {
			System.out.println("both strings are not anagram");
		}
		System.out.println("enter the string");
		String str=input.next();
		palindrome(str);

	}
	public static boolean anagram(String str1,String str2) {
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		int len1=c1.length;
		int len2=c2.length;
		if(len1 != len2) {
			return false;
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
        for (int i = 0; i < len1; i++) {
            if (c1[i] != c2[i]) {
            	return false;          	
            }       	
        }
	
	return true;
	}
	public static boolean palindrome(String str) {
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("the string is palindrome");
		}
		else {
			System.out.println("the string is not palindrome");
		}
		return true;
	}

}
