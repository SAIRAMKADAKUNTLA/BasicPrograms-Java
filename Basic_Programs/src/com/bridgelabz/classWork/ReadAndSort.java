package com.bridgelabz.classWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadAndSort {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\mbill\\Desktop\\sort1.txt";
		BufferedReader br=new BufferedReader(new FileReader(path));
		ArrayList<Integer> list = new ArrayList<>();
		String line;
		while((line=br.readLine()) != null) {
			int con=Integer.parseInt(line);
			list.add(con);
		}
		System.out.println("the unsorted list is:");
		System.out.println(list);
		System.out.println("the sorted list is:");
		Collections.sort(list);
		System.out.println(list);
		br.close();
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\mbill\\Desktop\\sort.txt"));
		for(int i=0;i<list.size();i++) {
			writer.write(list.toString());
			writer.newLine();
		}
	}

}
