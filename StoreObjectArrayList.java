class User
{
	private String name;
	private int age;

	//Constructor
	public User(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	//Get user's name
	public String getName()
	{
		return name;
	}

	public String toString()
	{
		return "Name:" + name + ", Age: " + age;
	}
}


public class StoreObjectArrayList
{
	public static void main(String[] d)
	{
		User user1 = new User("John Doe" , 100);
		User user2 = new User("John" , 1000);
		User user3 = new User("Doe" , 10000);

		//User's object store in Array
		User[] users = new User[3]; //User[] users = {user1,user2,user3};
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;

		//user's object get from Array
		for(int x=0; x<users.length; x++)
		{
			System.out.println("ID: " + (x+1) + ", " + users[x]);
		}
	}
}