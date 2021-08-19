package com.bridgelabz.day_3;

public class Car_Loan {
	///P=principleamount,Y=tears & R=intrest monthly
	public void Loan(double P,double Y,double R ) {
		double n=12*Y;
		double r=R/(12*100);
		double payment=P*r/1-(Math.pow((1+r),(-n)));
		System.out.println("Monthly payment for car loan is:"+payment);
	}

	public static void main(String[] args) {
		Car_Loan car=new Car_Loan();
		car.Loan(200000, 8,1500);

	}

}
