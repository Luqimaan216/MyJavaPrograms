import java.util.Scanner;

public class TemperatureConversion {
	static double input = 0.0;
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		String unit;
		
		System.out.println("What Unit of measurement would you like to convert to? ('c' for Fahrenheit to Centigrade and 'f' for Centigrade to Farenheit)");
		unit = scanner.nextLine();
		if(unit.equals("c"))
		{
			InitialiseToCentigrade();	
		}
		else if(unit.equals("f"))
		{
			InitialiseToFahrenheit();
		}
		System.out.println(input);
	}

	private static double InitialiseToFahrenheit() {
		// TODO Auto-generated method stub		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What value would you like to convert? Please write in double format");
		input = scanner.nextDouble();
		input = (input*1.8)+32;
		return input;
		
	}

	private static double InitialiseToCentigrade() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What value would you like to convert? Please write in double format");
		input = scanner.nextDouble();
		input = (input-32)/1.8;
		return input;
	}

}
