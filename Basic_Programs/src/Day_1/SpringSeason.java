package Day_1;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the day");
		int day=scan.nextInt();
		System.out.println("Enter the month");
		int month=scan.nextInt();
		if((month == 3 && day > 20 && day < 31) || (month == 4 && day < 30) || (month == 5 && day < 31) || (month == 6 && day > 20 && day < 30)) {
			System.out.println("it is a spring season");
		}
		else {
			System.out.println("it is not a spring season ");
		}

	}

}
