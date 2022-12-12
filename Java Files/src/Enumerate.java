import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Enumerate 
{
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new FileInputStream("documents/5 Lines.txt"));
		PrintWriter writer = new PrintWriter("documents/OutputFile.txt");
		for(int i=1; i <= 5; i++)
		{
			String line = scanner.nextLine();
			writer.println(i+". "+line);
		}
		scanner.close();
		writer.close();
		
	}

}
