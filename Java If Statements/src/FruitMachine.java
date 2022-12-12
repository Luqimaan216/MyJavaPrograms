import java.util.Scanner;

public class FruitMachine {
	
	public static void main(String [] args) {
		int fruit1 = (int)(Math.random()*12)+1;
		int fruit2 = (int)(Math.random()*12)+1;
		int fruit3 = (int)(Math.random()*12)+1;
		
		String fruit1Out = null;
		String fruit2Out = null;
		String fruit3Out = null;
		
		String userBet;
		int userReward;
		Scanner in = new Scanner(System.in);
		
		if (fruit1 == 1 || fruit1 == 2 || fruit1 == 3 || fruit1 == 4 || fruit1 == 5 || fruit1 == 6) {
			fruit1Out = "Apple";
		}
		else if(fruit1 == 7 || fruit1 == 8 || fruit1 == 9){
			fruit1Out = "Orange";
		}
		else if(fruit1 == 10 || fruit1 == 11) {
			fruit1Out = "Banana";
		}
		else if(fruit1 == 12) {
			fruit1Out = "Watermelon";
		}
		
		
		if (fruit2 == 1 || fruit2 == 2 || fruit2 == 3 || fruit2 == 4 || fruit2 == 5 || fruit2 == 6) {
			fruit2Out = "Apple";
		}
		else if(fruit2 == 7 || fruit2 == 8 || fruit2 == 9){
			fruit2Out = "Orange";
		}
		else if(fruit2 == 10 || fruit2 == 11) {
			fruit2Out = "Banana";
		}
		else if(fruit2 == 12) {
			fruit2Out = "Watermelon";
		}
		
		
		if (fruit3 == 1 || fruit3 == 2 || fruit3 == 3 || fruit3 == 4 || fruit3 == 5 || fruit3 == 6) {
			fruit3Out = "Apple";
		}
		else if(fruit3 == 7 || fruit3 == 8 || fruit3 == 9){
			fruit3Out = "Orange";
		}
		else if(fruit3 == 10 || fruit3 == 11) {
			fruit3Out = "Banana";
		}
		else if(fruit3 == 12) {
			fruit3Out = "Watermelon";
		}
		
		
		System.out.println("Welcome to... THE FRUITY MACHINE!");
		System.out.println("How much money would you like to bet?");
		userBet = in.nextLine();
		System.out.println("OK, You have bet £"+userBet);
		System.out.println("Spinning the fruity machine ...");
		System.out.println("Fruit 1 = "+fruit1Out);
		System.out.println("Fruit 2 = "+fruit2Out);
		System.out.println("Fruit 3 = "+fruit3Out);
		
		if(fruit1Out == "Apple" && fruit2Out == "Apple" && fruit3Out == "Apple") {
			userReward = (Integer.parseInt(userBet)*5);
			System.out.println("Congratulations You Got Three Apples, You Win £"+userReward);
		}
		else if(fruit1Out == "Orange" && fruit2Out == "Orange" && fruit3Out == "Orange") {
			userReward = (Integer.parseInt(userBet)*20);
			System.out.println("Congratulations You Got Three Oranges, You Win £"+userReward);
		}
		else if(fruit1Out == "Banana" && fruit2Out == "Banana" && fruit3Out == "Banana") {
			userReward = (Integer.parseInt(userBet)*40);
			System.out.println("Congratulations You Got Three Bananas, You Win £"+userReward);
		}
		else if(fruit1Out == "Watermelon" && fruit2Out == "Watermelon" && fruit3Out == "Watermelon") {
			userReward = (Integer.parseInt(userBet)*100);
			System.out.println("Congratulations You Got Three Watermelons, You Win £"+userReward);
		}
		else {
			System.out.println("Unlucky, You Didnt Win Anything. You Lost £"+userBet);
		}
		
	}

}
