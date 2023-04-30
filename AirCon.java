public class AirCon
{
	String brand;
	String type;
	int hp;

	public static void main(String[] args)
	{
		Remote remote1 = new Remote();

		remote1.charge = "Battery";

		System.out.println("Charge Type: " + remote1.charge);
		System.out.println("Power: " + remote1.power);

		remote1.powerOn();
		System.out.println("Power: " + remote1.power);
		System.out.println("Volume: " +remote1.power);

		remote1.volumeUp();
		System.out.println("Volume: " + remote1.volume);

	}
}


// 1 - Class (car)
//      #Attribute (inastance/non-static variable)
			// String color;
			// int model
//      #Method (instance/non-static method)
			// drive()
			// stop()

// 2 - Object (Instance -> object's create)
			// Car car1 = new Car();