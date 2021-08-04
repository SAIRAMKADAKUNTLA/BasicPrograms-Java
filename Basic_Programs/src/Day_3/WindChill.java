package Day_3;

import java.util.Scanner;

public class WindChill {
	public void Get() {
		double w;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the temperature in fahrenheit");
		double t=scan.nextDouble();
		System.out.println("enter the wind speed in miles per hr");
		double v=scan.nextDouble();
		if(t<50 || v<120 || v>3) {
			w=35.74+0.6215*t+(0.4275*t-35.75)*(Math.pow(v, 0.16));
			System.out.println("the effective temperature is w="+w);
		}
		else {
			System.out.println("Invalid values");
		}
	}

	public static void main(String[] args) {
		WindChill chill=new WindChill();
		chill.Get();

	}

}
