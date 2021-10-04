package com.bridgelabz.classWork;

public class GenerateBirthdays {
	public static void getMonth() {
		String[] date= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String[] month= {"jan","feb","march","april","june","july","august","sep","oct","nov","dec"};
		String[] year= {"1992","1993"};
		int randDate,randYear;
		int randMonth;
		int i;
		for(int j=0;j<month.length;j++) {
			System.out.println("Having birthdays in "+month[j]+" month is:");
			for(i=1;i<=50;i++) {
				randDate=(int)(Math.random()*date.length);
				randYear=(int)(Math.random()*year.length);
				randMonth=(int)(Math.random()*month.length);
				if(month[j] == month[randMonth]) {
					System.out.println(date[randDate]+" "+month[randMonth]+" "+year[randYear]);
				}
			}
		}
	}

	public static void main(String[] args) {
		getMonth();

	}

}
