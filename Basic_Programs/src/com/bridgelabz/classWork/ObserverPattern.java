package com.bridgelabz.classWork;

import java.util.Arrays;

class CricketData{
	Average avg;
	Score s;
	int runs,wickets;
	float overs;
	public CricketData(Average a,Score s) {
		this.avg=a;
		this.s=s;
	}
	public int getRuns() {
		return 200;
	}
	public int getWkts() {
		return 4;
	}
	public float getOvrs() {
		return (float)20.1;
	}
	public void getChanged() {
		runs=getRuns();
		wickets= getWkts();
		overs=getOvrs();
		s.update(runs, wickets, overs);
		avg.update(runs, wickets, overs);
	}
	public void printsum(int[] arr1,int[] arr2) {
		int[] result=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			result[i]=arr1[i]+arr2[i];
		}
		System.out.print(Arrays.toString(result));
	}
	public void unique(int[] arr1,int[] arr2) {
		int length=arr1.length;
		int i=0,j=0;
		while(i<length && j<length) {
			if(arr1[i] < arr2[j]) {
				System.out.print(arr1[i++]+" ");
			}
			else if(arr2[j] < arr1[i]) {
				System.out.print(arr2[j++]+" ");
			}
		    else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
		}
		while (i < length)
            System.out.print(arr1[i++] + " ");
        while (j < length)
            System.out.print(arr2[j++] + " ");
	}
}
class Average{
	int scorePreciction;
	float runRate;
	public void update(int runs,int wickets,float overs) {
		this.runRate=(float) runs/overs;
		this.scorePreciction=(int) (this.runRate*50);
		display();
		
	}
	public void display() {
		System.out.println("Runrate-"+runRate);
		System.out.println("predicted score-"+scorePreciction);
		
	}
	
}
class Score{
	int runs,wickets;
	float overs;
	public void update(int runs,int wickets,float overs) {
		this.runs=runs;
		this.wickets=wickets;
		this.overs=overs;
		display();
	}
	public void display() {
		System.out.println("Score-"+runs+"/"+wickets);
		System.out.println("Overs-"+overs);
	}
}
public class ObserverPattern {

	public static void main(String[] args) {
		Average a=new Average();
		Score s=new Score();
		CricketData c=new CricketData(a,s);
		c.getChanged();
		int[] arr1= {3,4,5,6};
		int[] arr2= {7,5,6,7};
		c.printsum(arr1, arr2);
		c.unique(arr1,arr2);
	}

}
