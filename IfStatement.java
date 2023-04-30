public class IfStatement
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 10;

		if( num1 > num2 )
		{
			System.out.println("num1 is greater than num2.");
		}
		else if( num1 < num2 )
		{
			System.out.println("num1 is less than num2.");
		}
		else
		{
			System.out.println("num1 is equal to num2.");
		}

		System.out.println("========");

		int number = 18;

		if( number%2 == 0 )
			System.out.println("Even number");
		else
			System.out.println("Odd number");

		System.out.println( (5==5) && (1<0) );
		System.out.println( !(5==5) || (1<0) ); 
	}
}