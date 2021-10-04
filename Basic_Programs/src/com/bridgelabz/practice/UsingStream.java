package com.bridgelabz.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UsingStream {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(5,6,7,3,2);
		List<String>names=Arrays.asList("ram","sai","hello");
		
		//collect method
		
		Set<Integer>sum=numbers.stream().map(x -> x+x).collect(Collectors.toSet());
		Set<String>result=names.stream().filter(x -> x.startsWith("s")).collect(Collectors.toSet());
		System.out.println(sum);
		System.out.println(result);
		
		//foreach method
		
		names.stream().forEach(y -> System.out.println(y));
		System.out.println("each element is:");
		numbers.stream().forEach(y -> System.out.print(y+" "));
		System.out.println("sum of each element");
		numbers.stream().map(x -> x+x).forEach(y -> System.out.print(y+" "));
		
		//reduce method
		
		System.out.println("even sum is");
		int evenSum=numbers.stream().filter(x->x%2==0).reduce(0,(a,b)->a+b);
		System.out.println(evenSum);

	}

}
