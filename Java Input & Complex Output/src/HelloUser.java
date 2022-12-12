import java.util.Scanner;

public class HelloUser {
	public static void main(String [] args) {
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		name = in.nextLine();
		System.out.println("Hello "+name);
		System.out.println(name+", its great to meet you");
		System.out.println("Good day "+name+", how are you today?");
	}

}
