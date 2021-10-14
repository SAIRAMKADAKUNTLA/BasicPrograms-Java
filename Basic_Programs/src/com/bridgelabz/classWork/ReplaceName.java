package com.bridgelabz.classWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceName {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\mbill\\Desktop\\fruits.txt");
		FileWriter fw=new FileWriter("C:\\Users\\mbill\\Desktop\\fruits.txt");
		BufferedReader br=new BufferedReader(fr);
		String fruits;
		while((fruits = br.readLine()) != null) {
			System.out.println(fruits);
		}
		BufferedWriter bw=new BufferedWriter(fw);
		String old="Mango";
		String neww="newMango";
		while((fruits = br.readLine()) != null) {
			if(fruits.contains(old)) {
				System.out.println(fruits.replace(old, neww));		
			}
		}
		br.close();
	}

}
