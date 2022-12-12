import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Decimal Number to Binary Converter");
        System.out.println("");
        while (true)
        {
            String binary = "";
            System.out.print("Enter a number");
            int input = scanner.nextInt();

            int result = input;

            while (result > 0)
            {
                binary = (result % 2) + binary;
                result = result / 2;
            }
            System.out.println("Binary number is " + binary);
        }

	}
}
