
public class TestPizza 
{
	public static void main(String [] args)
	{
		String [] toppings = new String[3];
		toppings[0] = "Chicken Tikka";
		toppings[1] = "Pepperoni";
		toppings[2] = "Donner";
		Pizza pizza1 = new Pizza("The Meat Feast",toppings, 19.50);
		System.out.println(pizza1.toString());
		
		String [] toppings2 = new String[5];
		toppings2[0] = "Onions";
		toppings2[1] = "Peppers";
		toppings2[2] = "Sweetcorn";
		toppings2[3] = "Chillis";
		toppings2[4] = "Mushrooms";
		Pizza pizza2 = new Pizza("Vegetarian Activists Lunch",toppings2, 15);
		System.out.println(pizza2.toString());
		
		
	}

}
