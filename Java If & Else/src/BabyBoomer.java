import java.time.LocalDate;
import java.util.Scanner;

public class BabyBoomer {
	
	public static void main(String [] args) {
		String age;
		int birthyear;
		String yearcorrect;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Find out if you are a baby boomer");
		System.out.println("");
		System.out.print("How old are you?");
		age = in.nextLine();
		birthyear = LocalDate.now().getYear()-Integer.parseInt(age);
		System.out.println("Is your birth year "+birthyear+"?('y' for yes, 'n' for no)");
		yearcorrect = in.nextLine();
		if (yearcorrect.equals("y")){
			System.out.println("YOU WERE BORN IN "+birthyear+"!!!");
			if (birthyear >= 1945 && birthyear <= 1964){
				System.out.println("YAY You are a baby boomer");
			}
			else {
				System.out.println("Unfortunately You are not a baby 75boomer");
			}
		}
		else {
			birthyear = birthyear - 1;
			System.out.println("YOU WERE BORN IN "+birthyear+"!!!");
			if (birthyear >= 1945 && birthyear <= 1964){
				System.out.println("YAY You are a baby boomer");
			}
			else {
				System.out.println("Unfortunately You are not a baby boomer");
			}
		}
	}

}
