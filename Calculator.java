import java.util.Scanner;

public class Calculator
{
	public static void main(String[] d)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.println(num1);

		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();
		System.out.println(num2);

		System.out.print("Choose an operator: ");
		String operator = scanner.next();
		//System.out.println(operator);

		int num = 0 ;

		switch(operator)
		{
			case "+" :
			num = num1 + num2; 
			System.out.println(num); break;
			case "-" :
			num = num1 - num2;
			System.out.println(num); break;
			case "*" :
			num = num1 * num2;
			System.out.println(num); break;
			case "/" :
			num = num1 / num2;
			System.out.println(num); break;

			default:
			System.out.println("Invalid Operator");
			break;
		}
	}
}