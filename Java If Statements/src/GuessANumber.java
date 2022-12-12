import java.util.Scanner;

public class GuessANumber {
	public static void main(String [] args) {
		String userNumber;
		int randomNumber = (int)(Math.random()*10)+1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Think of a number between 1 and 10, lets see if you can guess my number!");
		userNumber = in.nextLine();
		System.out.println("Your number is "+userNumber+" and my number is "+randomNumber);
		if(Integer.parseInt(userNumber) == randomNumber) {
			System.out.println("CONGRATULATIONS, YOU GUESSED THE SAME NUMBER AS ME!!!");
		}
		else {
			System.out.print("HAHA, YOU COULDNT GUESS MY NUMBER!");
		}
	}

}
