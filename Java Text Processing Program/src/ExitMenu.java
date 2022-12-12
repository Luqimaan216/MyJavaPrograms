import java.util.Scanner;

public class ExitMenu
{
    public void Exit()
    {
        System.out.println("Are you sure you want to exit? ('y' for yes, 'n' for no)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("y"))
        {
            System.out.println("Exiting...");
            System.exit(0);
        }
        else if (choice.equals("n"))
        {
            System.out.println("Reverting back to Main Menu...");
            MainMenu menu = new MainMenu();
            menu.main(null);
        }
        else
        {
            System.out.println("You have entered an incorrect value, please try again");
            Exit();
        }

    }
}
