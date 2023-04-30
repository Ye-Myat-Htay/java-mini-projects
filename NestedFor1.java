public class NestedFor1
{
	public static void main(String[] args)
	{
		for(int x=1; x<5; x++)
		{
			for (int y=1; y<6; y++)
			{
				System.out.print(x + "\t");
			}
			System.out.print("\n");
		}
	}
}

//1 1 1 1 1
//2 2 2 2 2
//3 3 3 3 3
//4 4 4 4 4