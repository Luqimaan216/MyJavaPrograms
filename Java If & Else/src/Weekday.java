import java.util.Scanner;

public class Weekday {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String day;
		
		System.out.println("Pick a day of the week represented by  its number (e.g. 1 for Monday, 2 for Tuesday etc");
		day = in.nextLine();
		if(day.equals("1")||day.equals("2")||day.equals("3")||day.equals("4")||day.equals("5")) {
			System.out.println("That is a weekday");
		}
		else if(day.equals("6")||day.equals("7")) {
			System.out.println("That is a weekend");
		}
		
	}

}
