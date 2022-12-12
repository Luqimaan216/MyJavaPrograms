import java.util.ArrayList;
import java.util.Scanner;

public class TestKeyboard
{
    public static void main(String [] args)
    {
        System.out.println("You have chosen 'Test Keyboard'");
        System.out.println("Choose which function you want to test:");
        System.out.println("1. Character Counter");
        System.out.println("2. Word Counter");
        System.out.println("3. Space Counter");
        System.out.println("4. Alphabet Counter");
        System.out.println("5. Find Minimum length of multiple string");
        System.out.println("6. Find Maximum length of multiple string");
        System.out.println("7. Find Total length of multiple strings");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(choice.equals("1"))
        {
            testCharCounter();
        }
        else if(choice.equals("2"))
        {
            testWordCounter();
        }
        else if(choice.equals("3"))
        {
            testSpaceCounter();
        }
        else if(choice.equals("4"))
        {
            testAlphaCounter();
        }
        else if(choice.equals("5"))
        {
            testMinLength();
        }
        else if(choice.equals("6"))
        {
            testMaxLength();
        }
        else if(choice.equals("7"))
        {
            testTotalLength();
        }
        else
        {
            System.out.println("Error. You have not entered a correct option \n Please try again \n Reverting back to Main Menu...");
            MainMenu.main(null);
        }
    }

    private static void testCharCounter()
    {
        String input = "Hello World";
        int expectedOutput = 10;
        System.out.println("The input string is 'Hello World' \n The expected output is "+expectedOutput);
        Keyboard key = new Keyboard();
        int actualOutput = key.characterCounter(input);
        boolean testSuccess = actualOutput == expectedOutput;
        if(testSuccess)
        {
            System.out.println("Test Success, The Character Count is " + actualOutput);
        }
        else
        {
            System.out.println("Test Failed");
            System.out.println("Expected output was: "
                    + expectedOutput);
            System.out.println("Actual output was: " + actualOutput);
        }


    }

    private static void testWordCounter()
    {
        String input = "Hello World";
        int expectedOutput = 2;
        System.out.println("The input string is 'Hello World' \n The expected output is "+expectedOutput);
        Keyboard key = new Keyboard();
        int actualOutput = key.wordCounter(input);
        boolean testSuccess = actualOutput == expectedOutput;
        if(testSuccess)
        {
            System.out.println("Test Success, The Word Count is " + actualOutput);
        }
        else
        {
            System.out.println("Test Failed");
            System.out.println("Expected output was: "
                    + expectedOutput);
            System.out.println("Actual output was: " + actualOutput);
        }
    }

    private static void testSpaceCounter()
    {
        String input = "Hello World";
        int expectedOutput = 1;
        System.out.println("The input string is 'Hello World' \n The expected output is "+expectedOutput);
        Keyboard key = new Keyboard();
        int actualOutput = key.spaceCounter(input);
        boolean testSuccess = actualOutput == expectedOutput;
        if(testSuccess)
        {
            System.out.println("Test Success, The Space Count is " + actualOutput);
        }
        else
        {
            System.out.println("Test Failed");
            System.out.println("Expected output was: "
                    + expectedOutput);
            System.out.println("Actual output was: " + actualOutput);
        }
    }

    private static void testAlphaCounter()
    {
        String input = "Hello World";
        ArrayList<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("1");
        expectedOutput.add("1");
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("1");
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("3");
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("2");
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("1");
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("1");
        expectedOutput.add("0");
        expectedOutput.add("0");
        expectedOutput.add("0");
        System.out.println("The input string is 'Hello World' \n The expected output is "+ expectedOutput);
        Keyboard key = new Keyboard();
        ArrayList<String> actualOutput = new ArrayList<String>();
        actualOutput.addAll(key.alphabetCounter(input));
        boolean testSuccess = actualOutput.equals(expectedOutput);
        if(testSuccess)
        {
            System.out.println("Test Success, The Alphabet Count is " + actualOutput);
        }
        else
        {
            System.out.println("Test Failed");
            System.out.println("Expected output was: "
                    + expectedOutput);
            System.out.println("Actual output was: " + actualOutput);
        }
    }

    private static void testMinLength()
    {
        String [] input = new String[]{"Hello", "World", "Hi"};
        int expectedOutput = 2;
        System.out.println("The input string is 'Hello' 'World' and 'Hi' \n The expected output is "+expectedOutput);
        Keyboard key = new Keyboard();
        int actualOutput = key.MinLength(input);
        boolean testSuccess = actualOutput == expectedOutput;
        if(testSuccess)
        {
            System.out.println("Test Success, The Minimum length is " + actualOutput);
        }
        else
        {
            System.out.println("Test Failed");
            System.out.println("Expected output was: "
                    + expectedOutput);
            System.out.println("Actual output was: " + actualOutput);
        }
    }

    private static void testMaxLength()
    {
        String [] input = new String[]{"Helloo", "World", "Hi"};
        int expectedOutput = 6;
        System.out.println("The input string is 'Hello' 'World' and 'Hi' \n The expected output is "+expectedOutput);
        Keyboard key = new Keyboard();
        int actualOutput = key.MaxLength(input);
        boolean testSuccess = actualOutput == expectedOutput;
        if(testSuccess)
        {
            System.out.println("Test Success, The Maximum length is " + actualOutput);
        }
        else
        {
            System.out.println("Test Failed");
            System.out.println("Expected output was: "
                    + expectedOutput);
            System.out.println("Actual output was: " + actualOutput);
        }
    }

    private static void testTotalLength()
    {
        String [] input = new String[]{"Hello", "World", "Hi"};
        int expectedOutput = 12;
        System.out.println("The input string is 'Hello' 'World' and 'Hi' \n The expected output is "+expectedOutput);
        Keyboard key = new Keyboard();
        int actualOutput = key.TotalLength(input);
        boolean testSuccess = actualOutput == expectedOutput;
        if(testSuccess)
        {
            System.out.println("Test Success, The Total length is " + actualOutput);
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
