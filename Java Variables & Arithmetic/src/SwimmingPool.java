import java.util.Scanner;

public class SwimmingPool {
	static String length;
	static String width;
	static String depth;
	static int cubic;
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the length of your swimming pool?");
		length = in.nextLine();
		System.out.println("What is the width?");
		width = in.nextLine();
		System.out.println("What is the depth?");
		depth = in.nextLine();
		cubic = (Integer.parseInt(length)*Integer.parseInt(width)*Integer.parseInt(depth))*1000;
		System.out.println("A Swimming pool with length "+length+"m, width "+width+"m and depth "+depth+"m will require "+cubic+" liters of water to fill it");
	}

}
