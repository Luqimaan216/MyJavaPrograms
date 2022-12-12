import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Uppercase {
	
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("GREETINGS MY GOOD SIR! What is the name of the file you wish to take an input from?");
		String input = scanner1.nextLine();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("What is the name of the file you would like to put the output into?");
		String output = scanner2.nextLine();
		
		Scanner scanner3 = new Scanner(new FileInputStream("documents/"+input));
		
		PrintWriter writer = new PrintWriter("documents/"+output);
		
		for(int i=1; i <= 5; i++)
		{
			String line = scanner3.nextLine();
			String newline = line.toUpperCase();
			writer.println(newline);
			
		}
		
		scanner2.close();
		scanner3.close();
		writer.close();
		System.out.println("End");
	}

}
