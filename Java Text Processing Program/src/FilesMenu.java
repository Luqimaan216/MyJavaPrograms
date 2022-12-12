import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesMenu extends MainMenu
{
    public static void main(String [] args)
    {
        System.out.println("You have chosen 'File'");
        System.out.println("Choose from one of the following options below:");
        System.out.println("1. Line Counter");
        System.out.println("2. Uppercase Converter");
        System.out.println("3. Text Enter");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.equals("1"))
        {
            System.out.println("You have chosen Line Counter");
            System.out.println("Create a text file in the Text Files folder(if you haven't already) and enter the name of the text file");
            System.out.println("Please make sure the text file has data inputted into it");
            String input = scanner.nextLine();
            Files file = new Files();
            System.out.println("The number of lines in your file are "+ file.LineCounter(input));
        }
        else if (choice.equals("2"))
        {
            System.out.println("You have chosen Uppercase Converter");
            System.out.println("Create a text file in the Text Files folder(if you haven't already) and enter the name of the text file");
            System.out.println("Please make sure the text file has data inputted into it");
            String input = scanner.nextLine();
            Files file = new Files();
            file.Uppercase(input);
            System.out.println("Your file contents have been successfully converted to uppercase, feel free to open the output file to see for yourself!");
        }
        else if (choice.equals("3"))
        {
            System.out.println("You have chosen Text Enter");
            System.out.println("Please enter the name of the output file");
            System.out.println("If you have not created an output file, thats fine, the program will create it for you. Just provide a name for the file");
            String output = scanner.nextLine();
            Files file = new Files();
            file.TextInput(output);
            System.out.println("Your Text has been successfully entered into the file, feel free to open the output file to see for yourself!");
        }
        else
        {
            System.out.println("Error. You have not entered a correct option \n Please try again \n Reverting back to Files Menu...");
            FilesMenu.main(null);
        }

        scanner.close();
    }
}
