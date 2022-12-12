import java.util.Scanner;

public class MainMenu
{

    public static void main(String [] args)
    {

        System.out.println("Welcome, This is Luqmaans Programming Assignment");
        System.out.println("Choose from one of the following options below:");
        System.out.println("1. Demo");
        System.out.println("2. Keyboard");
        System.out.println("3. File");
        System.out.println("4. Exit");


        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();


        if (choice.equals("1"))
        {
        	DemoMenu.main(null);
        }
        else if (choice.equals("2"))
        {
            KeyboardMenu.main(null);
        }
        else if (choice.equals("3"))
        {
            FilesMenu file = new FilesMenu();
            file.main(null);
        }
        else if (choice.equals("4"))
        {
            ExitMenu exit = new ExitMenu();
            exit.Exit();
        }
        else
        {
            System.out.println("Error. You have not entered a correct option \n Please try again \n Reverting back to Main Menu...");
            MainMenu.main(null);
        }

        scanner.close();

    }
}
