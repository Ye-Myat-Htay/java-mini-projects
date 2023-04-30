public class MainVehicle
{
	public static void main(String[] d)
	{
		Vehicle vehicle1 = new Vehicle(4, "Japan");
		System.out.println(vehicle1.info());

		Car car1 = new Car("Korea", 12 , "Diesel");
		System.out.println("Car1: " + car1.info());
	}
}