package com.bridgelabz.classWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StreamIO {
	public static void replaceString() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\mbill\\Desktop\\fruits.txt"));
		String result;
		while((result=br.readLine()) != null) {
			String old="mango";
			String neww="newmango";
			String modify=result.replaceAll(old, neww);
			System.out.println(modify);
		}
		br.close();
	}
	public static void longestString() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\mbill\\Desktop\\fruits.txt"));
		String fruit;
		String longest="";
		while((fruit=br.readLine()) != null) {
			if(fruit.length() > longest.length() ) {
				longest=fruit;
				
			}
		}
		System.out.println(longest);
		br.close();
		
	}
	

	public static void main(String[] args) throws IOException {
		replaceString();
		System.out.print("longest string is :: ");
		longestString();

	}

}
