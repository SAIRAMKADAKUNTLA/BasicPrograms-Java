package Day_3;

import java.util.Scanner;

public class DayOfWeek {///0=sunday,1=mondayso on 
	public void Get(int d,int m,int y) {//d=day,m=month,y=year
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the date to find day");
		int date=scan.nextInt();
		int y1=y-(14-m)/12;
		int x=y1+y1/4-y1/100+y1/400;
		int m1=m+12*((14-m)/12)-2;
		int d1=(d+x+31*m1/12)%7;
		System.out.println("the day of the week is: "+d1);
		
	}

	public static void main(String[] args) {
		DayOfWeek day=new DayOfWeek();
		day.Get(2, 4, 2021);

	}

}
