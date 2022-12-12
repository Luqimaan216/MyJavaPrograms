import java.util.Scanner;

public class TestCircle 
{
	public static void main(String [] args)
	{
	Scanner scanner = new Scanner(System.in);
	double radius = 0;
	System.out.println("What is your chosen radius of circle 1?");
	radius = scanner.nextDouble();
	Circle circle1 = new Circle(radius);
	System.out.println("Circle 1:");
	System.out.println("The area of circle 1 is "+circle1.calcArea());
	System.out.println("The perimeter of circle 1 is "+circle1.calcPerimeter());
	
	System.out.println("What is your chosen radius of circle 2?");
	radius = scanner.nextDouble();
	Circle circle2 = new Circle(radius);
	System.out.println("Circle 2:");
	System.out.println("The area of circle 2 is "+circle2.calcArea());
	System.out.println("The perimeter of circle 2 is "+circle2.calcPerimeter());
	scanner.close();
	
	}

}
