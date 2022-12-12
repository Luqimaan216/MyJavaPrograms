import java.util.Scanner;

public class NumberAnalysis {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int numIn;
		
		
		System.out.println("Enter Your Number Below, It Must Be An Integer");
		numIn = scan.nextInt();
		
		
		int numLength = Integer.toString(numIn).length();
		System.out.println("Your number has "+numLength+" digits");
		
		/*
		String numstr= Integer.toString(numIn);
		
		int sum = 0;
		
		for(int control=1; control > numLength; control++)
			 System.out.println(numstr.substring(control, control+1));
			 
		*/
		
		
		int sum = 0;
		int control = 0;
	
		for(sum = 0; numIn > 0; numIn = numIn/10)
		{
		control = numIn % 10;
		sum = sum + control;
		}
		System.out.println("The sum of all the digits in your number is "+sum);
	
		
		int product;
		int count = 0;
		for(product = 0; count <= numLength; )
		{
			
		}
			
		//System.out.println(num.substring(0));
		
		
		
	}

}
