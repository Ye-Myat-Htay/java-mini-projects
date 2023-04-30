public class NestedFor
{
	public static void main(String[] args)
	{
		// row - 5 (outer loop condition)//\\
		// col - 2 (inner loop)
		// * *
		// * *
		// * *
		// * *
		// * *

		for(int x=0; x<5; x++)
		{
			for(int y=0; y<2; y++)
			{
				System.out.print("*\t");
			}
			System.out.print("\n");
		}
	}
}


//1 1 1 1 1
//2 2 2 2 2
//3 3 3 3 3
//4 4 4 4 4

//9 9 9
//8 8 8
//7 7 7

//*
//* *
//* * *
//* * * *
//* * * * *

//* * * * *
//* * * *
//* * *
//* *
//*
