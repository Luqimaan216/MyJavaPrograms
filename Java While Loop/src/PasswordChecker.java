import java.util.Scanner;

public class PasswordChecker {

	public static void main(String [] args) {
		String username = "luqmaan";
		String enterUser;
		String enterPass;
		String password = "kotwal";
		Scanner scanner = new Scanner(System.in);
		char validation = 'n';
		
		while(validation == 'n') {
		System.out.println("Enter your username below");
		enterUser = scanner.nextLine();
		System.out.println("Enter the password below");
		enterPass = scanner.nextLine();
		if(username.equals(enterUser) && password.equals(enterPass)) {
			System.out.println("Success, Welcome Back!!!");
			validation = 'y';
		}
		else {
			System.out.println("Incorrct, Try Again");
			
		}
		}
	}
}
