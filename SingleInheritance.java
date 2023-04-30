public class SingleInheritance
{
	public static void main(String[] d)
	{
		Animal animal = new Animal();
		animal.type = "Cat";
		animal.age = 4;

		animal.animalInfo();

		Dog dog = new Dog();
		dog.name = "Aung Net";
		dog.type = "Golden Retriver";
		dog.age = 12;

		dog.dogInfo();
	}
}