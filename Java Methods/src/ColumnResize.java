import java.util.Scanner;

public class ColumnResize {
	static int number1;
	static int number2;
	public static void main(String[] args)
	 {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter 2 numbers");
	 
	 number1 = scanner.nextInt();
	 number2 = scanner.nextInt();
	 System.out.println(
	 "|number 1  |"
	 + "|number 2  |"
	 + "|add       |"
	 + "|subtract  |"
	 + "|times     |"
	 + "|divide    |");
	 

	 System.out.print("|"+ columnResize(number1 + "")+"|");
	 System.out.print("|" + columnResize(number2 + "") + "|");
	 System.out.print("|" + columnResize((number1 + number2)+"") + "|");
	 System.out.print("|" + columnResize((number1 - number2)+"") + "|");
	 System.out.print("|" + columnResize((number1 * number2)+"") + "|");
	 System.out.print("|" + columnResize((number1 / number2)+"") + "|");
	 }
	
	private static String columnResize(String text)
	{
		for(int i = text.length(); i < 10; i++)
		 {
			 text = text + " ";
		 }
		return text;
		
	}

}
