import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files
{
    public int LineCounter(String fileLocation)
    {
        int counter = 0;
        try
        {
            Scanner scanner = new Scanner(new FileInputStream("Assignment 1/Text Files/"+fileLocation));
            while (scanner.hasNextLine())
            {
                counter++;
                scanner.nextLine();
            }
            scanner.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("The program can't seem to find your file, please check the file name and try again");
            System.out.println("Reverting back to File Menu...");
            FilesMenu.main(null);
        }

        return counter;
    }

    public void Uppercase(String fileLocation)
    {
        try
        {
            Scanner scanner = new Scanner(new FileInputStream("Assignment 1/Text Files/"+fileLocation));
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter the name of the output file");
            System.out.println("If you have not created an output file, thats fine, the program will create it for you. Just provide a name for the file");
            String outputLocation = scanner2.nextLine();
            PrintWriter writer = new PrintWriter("Assignment 1/Text Files/"+outputLocation);

            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String newline = line.toUpperCase();
                writer.println(newline);

            }
            scanner.close();
            scanner2.close();
            writer.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("The program can't seem to find your file, please check the file name and try again");
            System.out.println("Reverting back to File Menu...");
            FilesMenu.main(null);
        }
    }

    public void TextInput(String outputLocation)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            PrintWriter writer = new PrintWriter("Assignment 1/Text Files/"+outputLocation);
            System.out.println("Please enter the text you wish to add to the file, be creative if you like!");
            String input = scanner.nextLine();
            writer.println(input);

            scanner.close();
            writer.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("The program can't seem to find your file, please check the file name and try again");
            System.out.println("Reverting back to File Menu...");
            FilesMenu.main(null);
        }


    }
}
