
public class InternetCustomer extends Customer
{
	private String emailAddress;

	public InternetCustomer(String reqName, String reqAddress, String reqEmailAddress) 
	{
		super(reqName, reqAddress);
		emailAddress = reqEmailAddress;
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return "\n" + super.getName() + " lives: " + super.getAddress() + ". Email: " + emailAddress;
	}
	
	

}
