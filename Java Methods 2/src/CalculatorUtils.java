import java.util.Scanner;

public class CalculatorUtils {
	static double a;
	static double b;
	static double c;
	static double output;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String [] args)
	{
		String calcType;
		System.out.println("Would you like to add(a), subtract(s), multiply(m) or divide(d)?");
		calcType = scanner.nextLine();
		if(calcType.equals("a"))
		{
			System.out.println("What is your first number?");
			a = scanner.nextDouble();
			System.out.println("What is your second number?");
			b = scanner.nextDouble();
			System.out.println("What is your third number?");
			c = scanner.nextDouble();
			add(a, b);
		}
		else if(calcType.equals("s"))
		{
			System.out.println("What is your first number?");
			a = scanner.nextDouble();
			System.out.println("What is your second number?");
			b = scanner.nextDouble();
			subtract(a, b);
		}
		else if(calcType.equals("m"))
		{
			System.out.println("What is your first number?");
			a = scanner.nextDouble();
			System.out.println("What is your second number?");
			b = scanner.nextDouble();
			System.out.println("What is your third number?");
			c = scanner.nextDouble();
			multiply(a, b);
		}
		else if(calcType.equals("d"))
		{
			System.out.println("What is your first number?");
			a = scanner.nextDouble();
			System.out.println("What is your second number?");
			b = scanner.nextDouble();
			divide(a, b);
		}
		System.out.println("Your answer is "+output);
	}
	public static double add(double a, double b) {
		return output = a + b +c;
	}
	public static double subtract(double a, double b) {
		// TODO Auto-generated method stub
		return output = a - b;
	}
	public static double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return output = a * b *c;
	}
	public static double divide(double a, double b) {
		// TODO Auto-generated method stub
		return output = a / b;
	}
	
}
