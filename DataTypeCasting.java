public class DataTypeCasting
{
	public static void main(String[] args)
	{

		//Widening DatatType Casting
		//byte -> short -> int -> long -> float -> double

		//Narrowing DataType Casting
		//double -> float -> long -> int -> short -> byte (need DataType-cast)

		double d = 5;

		int i = (int)d; //DataType-cast
		//Convert int to String
		int a = 10;
		String s = String.valueOf(a);
		System.out.println(s +5);

		//Convert String to Integer
		String str = "528";
		int b = Integer.parseInt(str);
		System.out.println(b + 1500);
	}
}