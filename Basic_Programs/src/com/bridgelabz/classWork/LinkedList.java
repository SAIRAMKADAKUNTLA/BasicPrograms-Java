package com.bridgelabz.classWork;

public class LinkedList {
	Node head;
	 class Node{
			int data;
			Node next;
		}
	 public void add(int data) {
		 Node node=new Node();
		 node.data=data;
		 node.next=null;
		 if(head == null) {
			 head=node;
		 }
		 else {
			 Node n =head;
			 while(n.next != null) {
				 n=n.next;
			 }
			 n.next=node;
		 }
		 
	 }
	 public void display() {
		 Node node=head;
		 while(node.next != null) {
			 System.out.println(node.data);
			 node=node.next;
		 }
	 }

	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.display();

	}

}
