
public class HelloPlanets {
	
	public static void main(String [] args)
	{
		String [] planet = new String[6];
		planet[0] = "Reach";
		planet[1] = "Sanghelios";
		planet[2] = "Earth";
		planet[3] = "Requiem";
		planet[4] = "Meridian";
		planet[5] = "The Ark";
		
		System.out.println("Lets say hello to some Halo Planets/Colonies");
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println("Hello "+planet[i]);
		}
	}

}
