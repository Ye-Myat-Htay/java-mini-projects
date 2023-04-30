public class LoginProcess
{
	public static void main(String[] args)
	{
		String name = "John Doe";
		int password = 123;

		if((name == "John Doe") && (password == 123))
		{
			System.out.println("Login successful :)");
		}
		else
		{
			System.out.println("User name and password didn't match :(");
		}
	}
}