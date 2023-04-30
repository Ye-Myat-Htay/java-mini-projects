public class Car extends Vehicle
{

	// vehicle(parent) -> wheel, engine
	String model;
	public Car(String model, int wheel, String engine)
	{
		//Call to parent's constructor
		super(wheel, engine);
		this.model = model;
	}

	public String info()
	{
		return "Model: " + model +", " + super.info();
										//call to paremt's method
	}
}