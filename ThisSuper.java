
//Keyword

// this -> current class
// super -> parent class/super/base class

//Constructor
//#Object create/instantiate -> values(infor)

class Animal
{
	String name = "Anonymous";
}

class Dog extends Animal
{
	String name = "Aung Net";

	public void getName()
	{
		System.out.println("Child Name: " + this.name);
		System.out.println("Parent Name: " + super.name);
	}
}

public class ThisSuper
{
	public static void main(String[] d)
	{
		Dog dog = new Dog();
		dog.getName();
	}
}