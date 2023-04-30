public class MyMath
{
	public static void main(String[] args)
	{
		System.out.println("Min: " + min(5, 10));
		System.out.println("Max: " + max(5, 10));

		pow(2, 4);

		System.out.println("Total Rand Number: " + totalRandNum());
	}
	public static int max(int num1 , int num2)
	{
		int n = 0;

		if(num1 > num2)
		{
			n = num1;
		}
		else
		{
			n = num2;
		}
		return n;
	}

	public static int min(int num1, int num2)
	{
				if(num1 < num2)
					return num1;
				else
					return num2;
	}

	public static void pow(int base, int power)
	{
		int result = 1;
		for(int x=0; x<power; x++)
		{
			result *= base;
		}
		System.out.println("Power: " + result);
	}

	public static int totalRandNum()
	{
		int[] arr = new int[5];
		int result = 0;
		//String[]

		for(int x=0; x<arr.length; x++)
		{
			arr[x] = (int)Math.round(Math.random() * 10);
			System.out.println("ARR[" + x + "]: " + arr[x]);


			//if
			
			result += arr[x];
		}
		return result;
	}
}

//if(arr[x]%2==0) even or odd else
//String[] str
