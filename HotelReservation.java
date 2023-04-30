import java.util.Scanner;

public class HotelReservation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter customer name: ");
		String name = scanner.nextLine();

		System.out.print("Choose room type: \n1.Garden View=50$\n2.Second Sea View=100$\n3.Sea View=150$\n ");
		String s = scanner.next();
		int roomType = Integer.parseInt(s);
		//int gardenview = 50;
		//int secondseaview = 100;
		//int seaview = 150;


		System.out.print("Enter total room: ");
		int totalRoom = scanner.nextInt();

		if(roomType == 1)
		{
			//int gardenview = 1;
			//System.out.println("Customer name");
			System.out.println("Customer Name" + "\t" + "Room Type" + "\t" + "Total Room" + "\t" + "Price");
			System.out.println("=============================================================================");
			System.out.println(name + "\t" + "\t" + "Garden View" + "\t" + "\t" + totalRoom + "\t" + totalRoom*50 + '$');
		}
		else if(roomType == 2)
		{
			//int secondseaview = 2;
			System.out.println("Customer Name" + "\t" + "Room Type" + "\t" + "Total Room" + "\t" + "Price");
			System.out.println("=============================================================================");
			System.out.println(name + "\t" + "\t" + "Second Sea View" + "\t" + "\t" + totalRoom + "\t" + totalRoom*100 + '$');

		}
		else
		{
			//int seaview = 3;
			System.out.println("Customer Name" + "\t" + "Room Type" + "\t" + "Total Room" + "\t" + "Price");
			System.out.println("=============================================================================");
			System.out.println(name + "\t" + "\t" + "Sea View" + "\t" + "\t" + totalRoom + "\t" + totalRoom*150 + '$');

		}
	}
}