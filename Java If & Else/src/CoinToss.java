
public class CoinToss {
	
	public static void main(String [] args) {
		int tossresult = (int)(Math.random()*2)+1;
		
		System.out.println("Welcome to the coin toss machine");
		System.out.println("");
		System.out.println("Coin is being tossed ...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		if (tossresult == 1) {
			System.out.println("Result: HEADS!!!");
		}
		else if (tossresult == 2) {
			System.out.println("Result: TAILS!!!");
		}
	}

}
