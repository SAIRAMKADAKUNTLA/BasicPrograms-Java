package com.bridgelabz.classWork;

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
		
	}

}
