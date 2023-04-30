public class Vehicle
{
	int wheel;
	String engine;

	//	Constructor
	// no-explict return type
	// same class name
	// similar method


	public Vehicle(int wheel, String engine)
	{
		this.wheel = wheel;
		this.engine = engine;
	}

	public String info()
	{
		return "Wheel: " + wheel + " , Engine: " + engine;
	}
}