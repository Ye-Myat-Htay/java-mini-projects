public class BasicMethod
{
	public static void main(String[] args)
	{
		getHello();

		//int n = getNum();
		//System.out.println("Num: " + n);
		System.out.println("Num: " + getNum());
	}

	public static void getHello()
	{
		System.out.println("Hello");
	}
	public static int getNum()
	{
		int num = 10;
		return num;
	}
}