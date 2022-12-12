import java.util.Scanner;

public class CalenderSwitch {
	static String monthID;
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the number of your chosen month?");
		monthID = in.nextLine();
		switch(Integer.parseInt(monthID)) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("That month has 31 days");
		break;
		case 2: System.out.println("That month has 28 days (29 if its a leap year)");
		break;
		case 4: case 6: case 9: case 11: System.out.println("That month has 30 days");
		break;
		
		}
		
	}

}
