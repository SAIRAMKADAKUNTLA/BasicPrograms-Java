package com.bridgelabz.classWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

class Book{
	private String name;
	private String city;
	private long number;
	Book(String name,String city,long number){
		this.name=name;
		this.city=city;
		this.number=number;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public long getNumber() {
		return number;
	}
	public String toString() {
		return "name-"+name+" "+"city-"+city+" "+"number-"+number;
	}	
}
public class Operations {

	public static void main(String[] args) {
		Collection<Book>c=new ArrayList<Book>();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter your choice");
			System.out.println("enter 1 to add contact");
			System.out.println("enter 2 to display contacts");
			System.out.println("enter 3 to search contact");
			System.out.println("enter 4 to delete contact");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter city");
				String city=sc.next();
				System.out.println("Enter phone number");
				long number=sc.nextLong();
				c.add(new Book(name,city,number));
				break;
			case 2:
				Iterator<Book>i=c.iterator();
				while(i.hasNext()) {
					Book b=i.next();
					System.out.println(b);
				}
				break;
			case 3:
				boolean got=false;
				System.out.println("enter name to search");
				String search=sc.next();
				i=c.iterator();
				while(i.hasNext()) {
					Book b=i.next();
					if(b.getName() == search) {
						System.out.println(b);
						got=true;
					}
				}
				if(!got) {
					System.out.println("contact found");
				}
				else {
					System.out.println("contact not found");
				}
				break;
			case 4:
				got=false;
				System.out.println("enter name to delete");
				String del=sc.next();
				i=c.iterator();
				while(i.hasNext()) {
					Book b=i.next();
					if(b.getName() == del) {
						i.remove();
						got = true;
					}
				}
				if(!got) {
					System.out.println("contact not found");
				}
				else {
					System.out.println("contact deleted");
				}
				break;
			}
		}
		while(choice != 0);
	}

}
