class SwitchCheckDay
{
	public static void main(String[] args)
	{
		int day = 3;
		String today = "";
		String dayType = "";

		switch(day)
		{
			case 1:
				today = "Monday";
				break;
			case 2:
				today = "Tuesday";
				break;
			case 3: today = "Wednesday"; break;

			default:
				today = "Invalid day!";

		}
		System.out.println("Today is " + today);
		System.out.println("=========");

		switch(day)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				dayType = "Weekday";
				break;

			case 6:
			case 7:
				dayType = "Weekend";

			default:
				today = "Invalid day type!";
		}
		System.out.println(today + " is " + dayType);
	}
}

//1  -Monday
//2  -Tuesday

//1-5 Weekday
//6-7 Weekend