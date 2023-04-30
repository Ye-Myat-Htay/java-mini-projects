import java.util.Scanner;

public class WhileLoop
{
	public static void main(String[] d)
	{
		int x=0;

		while(x<3)
		{
			System.out.println("Hello");
			x++;
		}
		System.out.println("======");

		String file = "Hello\nWorld\nHello\nWorld";

		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine())
		{
			System.out.println(scanner.nextLine());
		}
	}
}