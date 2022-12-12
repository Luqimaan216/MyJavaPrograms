import java.util.Scanner;

public class PrimeNumber 
{
	
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		int control;
		int input;
		boolean isPrime = false;
		boolean inProgramme = true;
		while(inProgramme)
		{
			System.out.println("Enter any number: ");
			input = sc.nextInt();
			
			
			for(int i = 2; i <= input/2; i++ ) 
			{
				control = input%i;
				if(control == 0) 
				{
					isPrime = false;
					break;
				}
				else
				{
					isPrime = true;
					break;
				}
			}
			if (isPrime == true) 
			{
				System.out.println(input +" is a prime number");
			}
			else 
			{
				System.out.println(input +" isnt a prime number");
			}
		}
	}
}
