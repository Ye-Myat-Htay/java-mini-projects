import java.util.Scanner;

public class DoWhileLoop
{
	public static void main(String[] d)
	{
		Scanner scanner = new Scanner(System.in);
		char isAgain = 0;

		do{

			System.out.print("calculate again(y/n): ");
			isAgain = scanner.next().charAt(0);
		} while( isAgain == 'y' || isAgain == 'Y');
	}
}