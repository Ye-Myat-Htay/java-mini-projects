class User
{
	String name;

	public User()
	{
		System.out.println("User Constructor");
	}

}

class Customer extends User
{
	String email;

	public Customer()
	{
		System.out.println("Customer Constructor");
	}
}


public class SuperDemo
{
	public static void main(String[] d)
	{
		User user1 = new User();
		System.out.println("========");
		Customer customer1 = new Customer();
	}
}