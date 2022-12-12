
public class Example1 
{
	  public static void main(String[] args)
	  {
	    // oblong 1
	    int height1 = 15;
	    int width1 = 5;

	    // oblong 2
	    int height2 = 20;
	    int width2 = 10;
	    
	    //oblong 3
	    int height3 = 123;
	    int width3 = 456;
	    
	    // calculate areas
	    int area1 = area(width1, height1);
	    int area2 = area(width2, height2);
	    int area3 = area(width3, height3);

	    // calculate widths
	    int perimeter1 = perimeter(width1, height1);
	    int perimeter2 = perimeter(width2, height2);
	    int perimeter3 = perimeter(width3, height3);

	    // print out results
	    printResults(width1, height1, area1, perimeter1);
	    printResults(width2, height2, area2, perimeter2);
	    printResults(width3, height3, area3, perimeter3);

	  }

	  //method to print out a text representation of the oblong
	  private static void printResults(int width, int height, int area,
	      int perimeter)
	  {
	    System.out.println("Oblong with width '" + width + "' and height '"
	        + height + "'  area '" + area + "' and perimeter '" + perimeter
	        + "'");

	  }

	  //calculate the area for the oblong
	  public static int area(int width, int height)
	  {
	    return width * height;
	  }

	  //calculate the perimeter for the oblong
	  public static int perimeter(int width, int height)
	  {
	    return (width + height) * 2;
	  }
}
