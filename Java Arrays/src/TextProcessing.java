import java.util.Scanner;

public class TextProcessing {
	static Scanner scanner = new Scanner(System.in);
	static String str;
	static char character;
	public static void main(String [] args)
	{
		int output;
		
		System.out.println("Give a word, phrase or sentance");
		str = scanner.nextLine();
		System.out.println("What char character would you like to test in the string you have given?");
		character = scanner.nextLine().charAt(0);
		output = timesCharOccurs(str, character);
		System.out.println("That character appears " + output + " times in your given String!!! Yay!");
		
		//Call letterFrequencies
		int[] results = letterFrequencies(str);
		
		//Save and print the result of letterFrequencies
		for(int i = 0; i < 26; i++)
		{
			System.out.println(results[i]);
		}
		//There is library code for printing an array, if you can find it
	}
	
	public static int timesCharOccurs(String str, char character)
	{
		int output = 0;
		
		char [] charArray = str.toLowerCase().toCharArray();
		for(int i = 0 ; i < charArray.length ; i++)
		{
			if(charArray[i] == character)
			{
				output = output + 1;
			}
		}
		return output; 
	}
	
	public static int[] letterFrequencies (String input)
	{
		char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int [] results = new int[26];
		
		for(int i = 0; i < 26; i++)
		{
			results[i] = timesCharOccurs(str, alphabet[i]);
			
		}
		//Calling timesCharOccurs for each letter of the alphabet
		//For loop from 0 - 26
		//Save the answer in the SAME PLACE in results		
		//results[2] = timesCharOccurs(input, alphabet[2]);
		
		return results;
	}

}
