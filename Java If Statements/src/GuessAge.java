import java.time.LocalDate;
import java.util.Scanner;

public class GuessAge {
	public static void main(String [] args) {
		String age;
		int birthyear;
		String yearcorrect;
		
		Scanner in = new Scanner(System.in);
		System.out.println("I BET I CAN GUESS YOUR YEAR OF BIRTH!!!");
		System.out.println("");
		System.out.print("How old are you?");
		age = in.nextLine();
		birthyear = LocalDate.now().getYear()-Integer.parseInt(age);
		System.out.println("Is your birth year "+birthyear+"?('y' for yes, 'n' for no)");
		yearcorrect = in.nextLine();
		if (yearcorrect.equals("y")){
			System.out.println("HA HA YOU WERE BORN IN "+birthyear+"!!! I GUESSED IT! I GUESSED IT!");
		}
		else {
			birthyear = birthyear - 1;
			System.out.println("YOU WERE BORN IN "+birthyear+", HA HA I GUESSED IT!!!");
		}
		
	}

}
