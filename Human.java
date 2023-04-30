public class Human
{
	//State (non-static variable)
	String name;
	int age;

	//Behaviors (instance method)
	public void humanInfo()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}


	//Main
	public static void main(String[] d)
	{
		Human human1 = new Human();
		human1.name = "John Doe";
		human1.age = 100;

		System.out.println( human1.name );
		System.out.println( human1.age );

		human1.humanInfo();
	}
}