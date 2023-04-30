public class MobileLegend
{
	String heroName;
	String heroRole;

	public void run()
	{
		System.out.println("Running......");
	}


	// public void fly()
	
	public static void main(String[] args)
	{
		MobileLegend mobilelegend1 = new MobileLegend();
		MobileLegend mobilelegend2 = new MobileLegend();

		mobilelegend1.heroName = "Miya";
		mobilelegend2.heroName = "Nana";

		mobilelegend1.heroRole = "Marksman";
		mobilelegend2.heroRole = "Mage";

		System.out.println( mobilelegend1.heroName);
		mobilelegend1.run();

		System.out.println( mobilelegend2.heroName);
		mobilelegend2.run();
	}
}