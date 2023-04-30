public class Facebook
{
	//State
	String name;
	int age;

	//Default-constructor
	public Facebook()
	{
		System.out.println("default/no-arguement constructor");
	}

	//Arguement-constructor
	public Facebook(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	//Method
	public void info()
	{
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
	}

	public static void main(String[] args)
	{
		Facebook facebook1 = new Facebook("John Doe" , 20);
		facebook1.info();

		Facebook facebook2 = new Facebook();
		facebook2.info();
	}
}