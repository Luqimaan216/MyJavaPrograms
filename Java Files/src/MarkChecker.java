import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MarkChecker 
{
	
	public static void main(String [] args) throws FileNotFoundException
	{
		
		Scanner scanner = 
				new Scanner(new FileInputStream("documents/Marks.txt"));
		double total = 0;
		double mark;
		int counter = 0;

		while(scanner.hasNextDouble())
		{
			mark = scanner.nextDouble();
			total = total + mark;
			counter = counter + 1;
		}
		System.out.println("The total of all the marks is "+ total);
		System.out.println("The number of marks that have been read are "+ counter);
		double average = (total/counter);
		System.out.println("The average score is "+average+" marks");
		
		if ((average >= 0)&&(average < 45))
		{
			System.out.println("The student has failed");
		}
		else if ((average >= 45)&&(average < 60))
		{
			System.out.println("The student has achieved a 2.2");
		}
		else if ((average >= 60)&&(average < 70))
		{
			System.out.println("The student has achieved a 2.1");
		}
		else if ((average >= 70)&&(average < 100))
		{
			System.out.println("The student has achieved a First, WHAT A LEGEND!!!");
		}
		
		
		
		
	}



}
