package com.bridgelabz.classWork;

interface Fruits{
	public void colour();
}
 class Apple implements Fruits{
	public void colour() {
		System.out.println("RED");
	}	
}
 class Banana implements Fruits{
	public void colour() {
		System.out.println("YELLOW");
	}	
}
 class Kiwi implements Fruits{
	public void colour() {
		System.out.println("Green");
	}	
}
  class Undefined implements Fruits{
	 public void colour() {
		 System.out.println("its undefined fruit");
	 }
 }
public class FactoryDesign {
	public Fruits getColour(String name) {
		if(name.equalsIgnoreCase("apple")) {
			return new Apple();
		}
		if(name.equalsIgnoreCase("banana")) {
			return new Banana();
		}
		if(name.equalsIgnoreCase("kiwi")) {
			return new Kiwi();
		}
		return new Undefined();
		
		
	}

	public static void main(String[] args) {
		FactoryDesign fd=new FactoryDesign();
		Fruits fr=fd.getColour("kiwi");
		fr.colour();
		Fruits fr1=fd.getColour("banana");
		fr1.colour();
		Fruits fr2=fd.getColour("apple");
		fr2.colour();
	}

}
