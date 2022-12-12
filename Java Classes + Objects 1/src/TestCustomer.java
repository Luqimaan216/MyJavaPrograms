
public class TestCustomer 
{
	public static void main(String [] args)
	{
		Customer customer1 = new Customer("Muhammad Al Muqit", "53 Al Baik Street, Muscat, Oman");
		System.out.println(customer1.toString());
		
		Customer customer2 = new Customer("Ahmad Al Muqit", "918 Madinati Road, Muscat, Oman");
		System.out.println(customer2.toString());
	}

}
