public class BasicArray
{
	public static void main(String[] args)
	{
		String[] fruits = new String[3];

		fruits[0] = "Apple";
		fruits[1] = "Orange";
		fruits[2] = "Banana";

		System.out.println("fruits[0]: " + fruits[0]);
		System.out.println("========");

		for(int x=0; x<3 ; x++)
		{
			System.out.println("Fruit: " + fruits[x]);
		}
	}
}