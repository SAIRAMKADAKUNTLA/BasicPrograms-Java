package Day_4;

public class Harmonic {
	public void Get(int n) {
		System.out.print("the Harmonic series is Hn=");
        for(int i=1;i<=n;i++) {
        	System.out.print("1/"+i+"+");
        }
	}

	public static void main(String[] args) {
		Harmonic h=new Harmonic();
		h.Get(8);

	}

}
