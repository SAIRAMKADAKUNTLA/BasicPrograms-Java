package com.bridgelabz.classWork;

public class ChaningConstructor {
	public ChaningConstructor() {
		System.out.println("printing addition");
	}
	public ChaningConstructor(int x) {	
	}
	

	public static void main(String[] args) {
		try {
			int result=1/1;
		}
		catch(Exception ex) {
			System.out.print(ex);
			System.exit(0);
		}
		finally {
			System.out.println("finally block");
		}
	}

}
