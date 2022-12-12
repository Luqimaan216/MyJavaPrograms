import java.util.Scanner;

public class TestStringUtils {

	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your first input? (e.g. 'abc')");
		String input1 = scanner.nextLine();
		System.out.println("What is your second string input? (e.g. 'def', or if nothing then leave blank)");
		String input2 = scanner.nextLine();
		System.out.println("What is your third string input? (e.g. 'ghi', or if nothing then leave blank)");
		String input3 = scanner.nextLine();
		String [] inputAll = {input1, input2, input3};
		
		System.out.println("Choose from one of the following options:");
		System.out.println("1. Get Total Length");
		System.out.println("2. Get Max Length");
		System.out.println("3. Get Min Length");
		String choice = scanner.nextLine();
		
		if(choice.equals("1"))
		{
			getTotalLength(inputAll);
		}
		else if(choice.equals("2"))
		{
			getMaxLength(inputAll);
		}
		else if(choice.equals("3"))
		{
			getMinLength(inputAll);
		}
	}

	private static void getMaxLength(String [] input) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		StringArrayUtils.getMaxLength(input);
		System.out.println("What is the expected max length?");
		int expectedOutput = scanner.nextInt();
		int actualOutput = StringArrayUtils.getMinLength(input);
		boolean testSuccess = actualOutput == expectedOutput;
		if(testSuccess)
		{
			System.out.println("Test Success, The Max Length is " + actualOutput);
		}
		else
		{
			System.out.println("Test Failed");
			System.out.println("Expected output was: "
					+ expectedOutput);
			System.out.println("Actual output was: " + actualOutput);
		}
		
	}

	private static void getTotalLength(String [] inputAll) 
	{
		// TODO Auto-generated method stub
		String [] input = inputAll;
		int expectedOutput = StringArrayUtils.getTotalLength(input);
		int actualOutput = StringArrayUtils.getTotalLength(input);
		boolean testSuccess = actualOutput == expectedOutput;
		if(testSuccess)
		{
			System.out.println("Test Success, The Number Of Characters are " + expectedOutput);
		}
		else
		{
			System.out.println("Test Failed");
			System.out.println("Expected output was: "
					+ expectedOutput);
			System.out.println("Actual output was: " + actualOutput);
		}
	}
	
	private static void getMinLength(String [] input) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		StringArrayUtils.getMinLength(input);
		System.out.println("What is the expected min length?");
		int expectedOutput = scanner.nextInt();
		int actualOutput = StringArrayUtils.getMinLength(input);
		boolean testSuccess = actualOutput == expectedOutput;
		if(testSuccess)
		{
			System.out.println("Test Success, The Min Length is " + actualOutput);
		}
		else
		{
			System.out.println("Test Failed");
			System.out.println("Expected output was: "
					+ expectedOutput);
			System.out.println("Actual output was: " + actualOutput);
		}
		
	}
	
}
