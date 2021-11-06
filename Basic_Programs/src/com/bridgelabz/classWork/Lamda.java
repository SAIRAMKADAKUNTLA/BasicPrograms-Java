package com.bridgelabz.classWork;

@FunctionalInterface
interface Iprime{
	 boolean getPrime(int number);
}
public class Lamda {

	public static void main(String[] args) {
		Iprime l=(number) ->{
			boolean check=true;
			for(int i=2;i<=number/2;i++) {
				if(number % i == 0) {
					return false;
				}
			}
			return true;
		};
		if(l.getPrime(3)) {
			System.out.println("it is a prime");	
		}
		else {
			System.out.println("it is not a prime");
		}

	}

}
