package com.bridgelabz.classWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInStringArray {
	public static void usingStreamAPI(String[] str) {
		System.out.println("the required array is :: ");
		List<String>list=Arrays.asList(str).stream().filter(s -> s != "bcd").collect(Collectors.toList());
		System.out.println(list);
	}
	public static void main(String[] args) {
		String[] str =  {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		usingStreamAPI(str);

	}

}
