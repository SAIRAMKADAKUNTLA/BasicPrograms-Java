package com.bridgelabz.practice;

public class GenericClass <T> {
	T value;
	public GenericClass(T value) {
		this.value=value;
	}
	public void print() {
		System.out.println("the value is : "+value);
	}
	

	public static void main(String[] args) {
		GenericClass<String>g=new GenericClass<String>("generics");
		g.print();
	}

}
