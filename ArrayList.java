class User
{
	private String name;			//StoreObjectArrayList Homework
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

public class ArrayList
{

	public static void main(String[] args)
	{
		User user1 = new User("Lesley", 100);
		User user2 = new User("Johnson", 10);
		User user3 = new User("Change", 15);

		ArrayList<User> num = new ArrayList<User>();
		num.add(5);
		num.add(50);
		num.add(500);

		System.out.println( num.get(2));
	}
}