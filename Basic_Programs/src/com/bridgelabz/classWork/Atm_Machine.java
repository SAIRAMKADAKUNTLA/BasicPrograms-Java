package com.bridgelabz.classWork;

import java.util.Scanner;

public class Atm_Machine {
	String[] userId= {"user12","user23","user45"};
	String[] pass= {"2345","4567","6789"};
	int balance=500000,withdraw,deposit,count=0;
    int[] notes={2000,500,200,100,50,20,10,5,1};
	String[] phoneNumber= {"1234567898","2345678954","3456789065"} ;
	String[] AccNumber= {"76895","76854","56784"};
	public void Get() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the userid");
		String user=scan.next();
		System.out.println("Enter the password");
		String pwd=scan.next();
		for(int i=0;i<userId.length;i++) {
			if(userId[i].equals(user) && pass[i].equals(pwd)) {
				System.out.println("Enter your choice");
				System.out.println("enter 1 to check balance");
				System.out.println("enter 2 to deposit the amount");
				System.out.println("enter 3 to withdraw the amount");
				System.out.println("enter 4 to generate the pin");
				System.out.println("enter 5 to exit");
			}
		}
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("the Balance is:"+balance);
			break;
		case 2:
			System.out.println("Enter amount to deposit");
			deposit=scan.nextInt();
			balance=balance+deposit;
			System.out.println("your transaction is succesfull");
			System.out.println("the available Balance is:"+balance);
			break;
		case 3:
			int[] count=new int[9];
			System.out.println("Enter amount to withdraw");
			withdraw=scan.nextInt();
			if(balance >= withdraw) {
				balance=balance-withdraw;
				System.out.println("Please collect your cash");
			}
			else {
				System.out.println("Insufficient Balance");
			}
              for(int i=0;i<9;i++) {
            	  if(withdraw >= notes[i]) {
            		  count[i]=withdraw/notes[i];
            		  withdraw=withdraw%notes[i];
            	  }
              }
              for(int i=0;i<9;i++) {
            	  if(count[i] != 0) {
            		  System.out.println(notes[i]+" x "+count[i]);
            	  }
              }
				System.out.println("the avaliable Balance is:"+balance);
			break;
		case 4:
			System.out.println("Enter your account number");
			String Acc=scan.next();
			System.out.println("Enter your mobile number");
			String num=scan.next();
			for(int i=0;i<AccNumber.length;i++) {
				for(int j=0;j<phoneNumber.length;j++) {
					if(AccNumber[i].equals(Acc) && phoneNumber[j].equals(num) ) {
						System.out.println("enter the OTP");
						int otp=scan.nextInt();
						System.out.println("enter your new pin");
						System.out.println("NOTE:use only four numbers");
						String pin=scan.next();
						System.out.println("your pin generated successfully");
					}
				}
			}
			
			break;
		case 5:
			System.exit(0);
			break;
	    default:
	    	System.out.println("Invalid slection");
	    	break;				
		}

	}

	public static void main(String[] args) {
		Atm_Machine atm=new Atm_Machine();
		atm.Get();
		
	}

}
