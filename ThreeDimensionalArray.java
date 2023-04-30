public class ThreeDimensionalArray
{
	public static void main(String[] args)
	{
		int[][][] arr = { { { 5, 10 },{ 15, 20 } } , { {25, 30 } ,{35 , 40 , 45 } } };

		System.out.println("ARR[1] SIZE: " + arr[1][1].length);
		System.out.println( arr[1][1][2] );

		for(int x=0 ; x<arr.length; x++)
		{
			for(int y=0; y<arr[x].length; y++)
			{
				for(int z=0 ; z<arr[y].length; z++)
				{
					System.out.print(arr[x][y][z] + " ");
				}
			}
			System.out.print("\n");
		}
	}
}