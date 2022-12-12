import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFiles
{
    public static void main(String [] args) throws FileNotFoundException {
        System.out.println("You have chosen 'Test File'");
        System.out.println("Choose which file function you want to test:");
        System.out.println("1. Line Counter");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(choice.equals("1"))
        {
            testLineCounter();
        }
        else
        {
            System.out.println("Error. You have not entered a correct option \n Please try again \n Reverting back to Main Menu...");
            MainMenu.main(null);
        }
    }

    private static void testLineCounter()
    {
        String input = "Line Counter.txt";
        int expectedOutput = 4;
        Files file = new Files();
        int actualOutput = file.LineCounter(input);
        boolean testSuccess = actualOutput == expectedOutput;
        if (testSuccess)
        {
            System.out.println("Test Success, The Number of Lines is " + actualOutput);
        }
        else
        {
            System.out.println("Test Failed");
            System.out.println("Expected output was: "
                    + expectedOutput);
        }
    }

}
