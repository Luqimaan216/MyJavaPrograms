import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class KeyboardMenu extends MainMenu
{
    public static void main(String [] args)
    {
        System.out.println("You have chosen 'Keyboard'");
        System.out.println("Choose from one of the following options below:");
        System.out.println("1. Character Counter");
        System.out.println("2. Word Counter");
        System.out.println("3. Space Counter");
        System.out.println("4. Alphabet Counter");
        System.out.println("5. Find Minimum length of multiple string");
        System.out.println("6. Find Maximum length of multiple string");
        System.out.println("7. Find Total length of multiple strings");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();


        if (choice.equals("1"))
        {
            System.out.println("You have chosen Character Counter");
            System.out.println("Enter any word, sentence or phrase");
            String input = scanner.nextLine();
            Keyboard key = new Keyboard();
            System.out.println("Calculating...");
            System.out.println("The number of characters in your string is "+ key.characterCounter(input) + " (without spaces)");


        }
        else if (choice.equals("2"))
        {
            System.out.println("You have chosen Word Counter");
            System.out.println("Enter any word, sentence or phrase");
            String input = scanner.nextLine();
            Keyboard key = new Keyboard();
            System.out.println("Calculating...");
            System.out.println("The number of words in your string is "+ key.wordCounter(input));
        }
        else if (choice.equals("3"))
        {
            System.out.println("You have chosen Space Counter");
            System.out.println("Enter any sentence or phrase");
            String input = scanner.nextLine();
            Keyboard key = new Keyboard();
            System.out.println("Calculating...");
            System.out.println("The number of spaces in your string is "+ key.spaceCounter(input));
        }
        else if (choice.equals("4"))
        {
            System.out.println("You have chosen Alphabet Counter");
            System.out.println("Enter any word, sentence or phrase");
            String input = scanner.nextLine();
            Keyboard key = new Keyboard();
            System.out.println("Calculating...");
            ArrayList<String> count = key.alphabetCounter(input);
            char [] charAlphabet = new char[]{'A', 'B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P','Q','R', 'S', 'T', 'U', 'V', 'W', 'X','Y', 'Z'};
            System.out.println("---------");
            for(int i = 0; i < 26; i++)
            {
                System.out.println("| "+charAlphabet[i]+" | "+count.get(i)+" |");
                System.out.println("---------");
            }
        }
        else if (choice.equals("5"))
        {
            System.out.println("You have chosen Find Minimum length of multiple strings");
            System.out.println("What is your first input? (e.g. 'abc')");
            String input1 = scanner.nextLine();
            System.out.println("What is your second string input? (e.g. 'def', or if nothing then leave blank)");
            String input2 = scanner.nextLine();
            System.out.println("What is your third string input? (e.g. 'ghi', or if nothing then leave blank)");
            String input3 = scanner.nextLine();
            String [] inputAll = {input1, input2, input3};
            Keyboard key = new Keyboard();
            System.out.println("Calculating...");
            System.out.println("The minimum length out of all your strings is "+ key.MinLength(inputAll));
        }
        else if (choice.equals("6"))
        {
            System.out.println("You have chosen Find Maximum length of multiple strings");
            System.out.println("What is your first input? (e.g. 'abc')");
            String input1 = scanner.nextLine();
            System.out.println("What is your second string input? (e.g. 'def', or if nothing then leave blank)");
            String input2 = scanner.nextLine();
            System.out.println("What is your third string input? (e.g. 'ghi', or if nothing then leave blank)");
            String input3 = scanner.nextLine();
            String [] inputAll = {input1, input2, input3};
            Keyboard key = new Keyboard();
            System.out.println("Calculating...");
            System.out.println("The maximum length out of all your strings is "+ key.MaxLength(inputAll));
        }
        else if (choice.equals("7"))
        {
            System.out.println("You have chosen Find Total length of strings");
            System.out.println("What is your first input? (e.g. 'abc')");
            String input1 = scanner.nextLine();
            System.out.println("What is your second string input? (e.g. 'def', or if nothing then leave blank)");
            String input2 = scanner.nextLine();
            System.out.println("What is your third string input? (e.g. 'ghi', or if nothing then leave blank)");
            String input3 = scanner.nextLine();
            String [] inputAll = {input1, input2, input3};
            Keyboard key = new Keyboard();
            System.out.println("Calculating...");
            System.out.println("The total length of all your strings is "+ key.TotalLength(inputAll));
        }
        else
        {
            System.out.println("Error. You have not entered a correct option \n Please try again \n Reverting back to Keyboard Menu...");
            KeyboardMenu.main(null);
        }



        scanner.close();
    }

}
