import java.util.Scanner;

public class Circle 
{
	private double radius;
	
	public Circle(double reqRadius)
	{
		/*
		Circle circle1 =  new Circle(4);
		calcPerimeter(radius);
		System.out.println("The perimeter of your cirle is "+ perimeter);
		calcArea(radius);
		System.out.println("The area of your circle is "+ area);
		*/
		radius = reqRadius;
	}

	public double calcArea() 
	{
		// TODO Auto-generated method stub
		double area = Math.PI*(radius*radius);
		return area;
	}

	public double calcPerimeter() 
	{
		// TODO Auto-generated method stub
		double perimeter = Math.PI*(2*radius);
		return perimeter;
	}

}
