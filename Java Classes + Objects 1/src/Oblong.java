
public class Oblong 
{
	//the height ad width of the oblong
	  private int height;
	  private int width;

	  //main constructor - takes the height and width of the oblong
	  public Oblong(int reqHeight, int reqWidth)
	  {
	    height = reqHeight;
	    width = reqWidth;
	  }

	  //calculate the area of the oblong
	  public int area()
	  {
	    return height * width;
	  }

	  //calculate the perimeter of the oblong
	  public int perimeter()
	  {
	    return 2 * height + 2 * width;
	  }

	  //print out a text representation of the oblong
	  public String toString()
	  {
	    return "Oblong with width '" + width + "' and height '"
	        + height + "'  area '" + area() + "' and perimeter '" + perimeter()
	        + "'";
	  }
}
