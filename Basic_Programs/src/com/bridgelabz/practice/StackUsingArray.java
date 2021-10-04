package com.bridgelabz.practice;

public class StackUsingArray {
	int stack[];
	int size;
	int top;
	public StackUsingArray(int size) {
		top=-1;
		this.size=size;
		stack=new int[size];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == size-1;
	}
	public void push(int element) {
		if(isFull()) {
			System.out.println("the stack is overflow");
		}
		else {
			top++;
			stack[top]=element;
		}
	}
	public void  pop()
	{
		if(isEmpty()) {
			System.out.println("the stack is underflow");
		}
		else {
			top--;
		}
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("the stack is empty");
		}
		System.out.println("the peek element is:"+stack[top]);
	}
	public void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
	public void getSize() {
		System.out.println("the size is:"+size);
	}
	public static void main(String[] args) {
		StackUsingArray stack=new StackUsingArray(10);
		stack.push(12);
		stack.push(14);
		stack.push(15);
		stack.push(17);
		stack.display();
		System.out.println("after pop");
		stack.pop();
		stack.display();
	    stack.peek();
	}

}
