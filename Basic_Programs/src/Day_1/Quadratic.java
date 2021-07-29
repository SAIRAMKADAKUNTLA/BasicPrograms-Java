package Day_1;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		   System.out.println("enter a value");
		   double a=scan.nextDouble();
		   System.out.println("enter b value");
		   double b=scan.nextDouble();
		   System.out.println("enter c value");
		   double c=scan.nextDouble();
		   double delta = b * b - 4 * a * c;
		   double rootOne=(-b + Math.sqrt(delta)) / (2 * a);
		   double rootTwo=(-b - Math.sqrt(delta)) / (2 * a);
		   System.out.println("first root is:"+rootOne);
		   System.out.println("second root is:"+rootTwo);

	}

}
