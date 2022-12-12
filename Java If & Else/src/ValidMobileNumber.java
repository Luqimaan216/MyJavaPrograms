import java.util.Scanner;

public class ValidMobileNumber {
	
	public static void main(String [] args) {
		String phoneNumber;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your mobile number below");
		phoneNumber = in.nextLine();
		boolean testResult1 = phoneNumber.startsWith("07");
		if (testResult1) {
			System.out.println("Your number has passed the first test, it starts with '07'");
			int numberLength = phoneNumber.length();
			if(numberLength == 11) {
				System.out.println("Your number has passed the second test, it is 11 characters long");
			}
			else if (numberLength != 11) {
				System.out.print("Your number has failed the second test, it is not 11 characters long");
			}
			
		}
		else if (! testResult1) {
			System.out.println("Your number has failed the first test, it doesnt start with '07'");
		}
		
		
		
		
		
	}

}
