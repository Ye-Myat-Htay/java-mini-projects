public class TwoDimensionalArray
{
	public static void main(String[] args)
	{
		int[][] num = new int[2][3];

		num[0][0] = 5;
		num[0][1] = 10;
		num[0][2] = 15;

		num[1][0] = 20;
		num[1][1] = 25;
		num[1][2] = 30;


		System.out.println("NUM[1][1]: " + num[1][1]);

		int[][] arr = { {5,10}, {15,20,25}, {30}, {35,40} };

		System.out.println("ARR[2] SIZE: " + arr[2].length);

		for(int x=0; x<arr.length; x++)
		{
			for (int y=0; y<arr[x].length; y++)
			{
				System.out.print( arr[x][y] + " " );
			}
			System.out.print("\n");
		}
	}
}