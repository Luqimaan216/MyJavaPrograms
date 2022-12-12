import java.util.Scanner;

public class LotteryNumbers {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int randNum1 = (int)((Math.random()*((99-1)+1))+1);
		int randNum2 = (int)((Math.random()*((99-1)+1))+1);
		int randNum3 = (int)((Math.random()*((99-1)+1))+1);
		int randNum4 = (int)((Math.random()*((99-1)+1))+1);
		
		int num1;
		int num2;
		int num3;
		int num4;
		
		System.out.println("What is your first number?");
		num1 = scanner.nextInt();
		System.out.println("What is your second number?");
		num2 = scanner.nextInt();
		System.out.println("What is your third number?");
		num3 = scanner.nextInt();
		System.out.println("What is your last number?");
		num4 = scanner.nextInt();
		
		if(randNum1 == num1) {
			System.out.println("Your first number is correct!");
		}
		else if(randNum1 != num1) {
			System.out.println("Sorry, Your first number is wrong");
		}
		
		if(randNum2 == num2) {
			System.out.println("Your second number is correct!");
		}
		else if(randNum2 != num2) {
			System.out.println("Sorry, Your second number is wrong");
		}
		
		if(randNum3 == num3) {
			System.out.println("Your third number is correct!");
		}
		else if(randNum3 != num3) {
			System.out.println("Sorry, Your third number is wrong");
		}
		
		if(randNum4 == num4) {
			System.out.println("Your last number is correct!");
		}
		else if(randNum4 != num4) {
			System.out.println("Sorry, Your last number is wrong");
		}
		
		
		
		if(num1 == randNum1 && num2 == randNum2 && num3 == randNum3 && num4 == randNum4) {
			System.out.println("CONGRATS!!! CONGRATS!!! CONGRATS!!! YOU HAVE WON THE LOTTERY!");
		}
	}

}
