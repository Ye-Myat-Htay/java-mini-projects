public class Unary
{
	public static void main(String[] args)
	{
		int num = 7;
		// Override
		// num = num + 1;
		
		++num;
		num--;
		++num;
		num++;
		System.out.println( --num );
		System.out.println( num++ );
		System.out.println( ++num );
	}
}