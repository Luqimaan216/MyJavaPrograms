import java.util.Scanner;

public class DemoMenu extends MainMenu
{
    public static void main(String [] args)
    {
        System.out.println("You have chosen 'Demo'");
        System.out.println("Here you can test the functions of the program");
        System.out.println("Which category from the following of functions would you like to test?:");
        System.out.println("1. Keyboard Functions");
        System.out.println("2. File Functions");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(choice.equals("1"))
        {
            TestKeyboard.main(null);
        }
        else if (choice.equals("2"))
        {

        }
        else
        {

        }
    }
}
