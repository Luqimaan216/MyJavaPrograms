import java.util.Scanner;

public class Calender {
	static String monthID;
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the number of your chosen month?");
		monthID = in.nextLine();
		if(monthID.equals("1")||monthID.equals("3")|| monthID.equals("5") || monthID.equals("7")|| monthID.equals("8") || monthID.equals("10") || monthID.equals("12")) {
			System.out.println("That month has 31 days");
		}
		else if(monthID.equals("2")) {
			System.out.println("That month has 28 days (29 if its a leap year)");
		}
		else {
			System.out.println("That month has 30 days");
		}
		
	}

}
