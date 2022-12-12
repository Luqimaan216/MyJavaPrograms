import java.util.Scanner;

public class LargestNumber {
	static String firstnumber;
	static String secondnumber;
	static String thirdnumber;
	
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your first number?");
		firstnumber = in.nextLine();
		System.out.println("What is your second number?");
		secondnumber = in.nextLine();
		System.out.println("What is your third number?");
		thirdnumber = in.nextLine();
		
		if (Integer.parseInt(firstnumber) > Integer.parseInt(secondnumber)) {
			if(Integer.parseInt(firstnumber) > Integer.parseInt(thirdnumber)) {
				System.out.println("The biggest number is: " + firstnumber);
			}
			else {
				System.out.println("The biggest number is: " + thirdnumber);
			}
		}
		else {
			if(Integer.parseInt(secondnumber) > Integer.parseInt(thirdnumber)) {
				System.out.println("The biggest number is: " + secondnumber);
			}
			else {
				System.out.println("The biggest number is: " + thirdnumber);
			}
		}
		
		
	}

}
