package com.bridgelabz.classWork;

interface Ifruit{
	void colour();
}
class Pomegranet implements Ifruit{
	public void colour() {
		System.out.println("Red");
	}
}
class Mango implements Ifruit{
	public void colour() {
		System.out.println("yellow");
	}
}
class Grapes implements Ifruit{
	public void colour() {
		System.out.println("green");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Ifruit i=new Pomegranet();
		i.colour();
		

	}

}
