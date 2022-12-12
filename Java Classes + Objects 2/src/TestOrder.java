
public class TestOrder 
{
	public static void main(String [] args)
	{
		Customer customer1 = new Customer("Muhammad Al Muqit", "53 Al Baik Street, Muscat, Oman");
		
		String [] toppings = new String[3];
		toppings[0] = "Chicken Tikka";
		toppings[1] = "Pepperoni";
		toppings[2] = "Donner";
		Pizza pizza1 = new Pizza("The Meat Feast",toppings, 19.50);
		
		String [] toppings2 = new String[5];
		toppings2[0] = "Onions";
		toppings2[1] = "Peppers";
		toppings2[2] = "Sweetcorn";
		toppings2[3] = "Chillis";
		toppings2[4] = "Mushrooms";
		Pizza pizza2 = new Pizza("Vegetarian Activists Lunch",toppings2, 15);
		
		Pizza [] pizzas = new Pizza[2];
		pizzas[0] = pizza1;
		pizzas[1] = pizza2;
		
		Order order1 = new Order(customer1, pizzas);
		System.out.println(order1.toString());
	}
}
