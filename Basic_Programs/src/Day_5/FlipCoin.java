package Day_5;

public class FlipCoin {
	int heads=1;
	int tails=0;
	public void Percentage() {
		int check=(int)(Math.random()*2);
		System.out.println(check);
		if(check == heads) {
			System.out.println("Its Heads!!!");
			heads++;
			System.out.println("heads percentage"+heads);
			
		}
		else {
			System.out.println("Its Tails!!!");
			tails++;
			System.out.println("tails percentage"+tails);
		}
		
	}

	public static void main(String[] args) {
		FlipCoin fc=new FlipCoin();
		fc.Percentage();
		// TODO Auto-generated method stub

	}

}
