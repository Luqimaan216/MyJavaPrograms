import java.util.Scanner;

public class TimesTable {
	public static void main(String [] args) {
		String horizontal;
		String num;
		Scanner in = new Scanner(System.in);
		System.out.println("Give a number for the times table");
		num = in.nextLine();
		
		horizontal = "+--------------+";
		System.out.println(horizontal);
		System.out.println("|1  x "+num+" = |"+(Integer.parseInt(num)*1)+" |");
		System.out.println("|2  x "+num+" = |"+(Integer.parseInt(num)*2)+" |");
		System.out.println("|3  x "+num+" = |"+(Integer.parseInt(num)*3)+" |");
		System.out.println("|4  x "+num+" = |"+(Integer.parseInt(num)*4)+" |");
		System.out.println("|5  x "+num+" = |"+(Integer.parseInt(num)*5)+" |");
		System.out.println("|6  x "+num+" = |"+(Integer.parseInt(num)*6)+" |");
		System.out.println("|7  x "+num+" = |"+(Integer.parseInt(num)*7)+" |");
		System.out.println("|8  x "+num+" = |"+(Integer.parseInt(num)*8)+" |");
		System.out.println("|9  x "+num+" = |"+(Integer.parseInt(num)*9)+"|");
		System.out.println("|10 x "+num+" = |"+(Integer.parseInt(num)*10)+"|");
		System.out.println("|11 x "+num+" = |"+(Integer.parseInt(num)*11)+"|");
		System.out.println("|12 x "+num+" = |"+(Integer.parseInt(num)*12)+"|");
		System.out.println(horizontal);
	}
}
