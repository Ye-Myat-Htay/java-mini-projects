abstract class Hamburger
{
	public abstract void burger();
}

class McDonald extends Hamburger
{
	@Override
	public void burger()
	{
		System.out.println("McDonald Hamburger");
	}
}

public class MakeBurger
{
	public static void main(String[] args)
	{
		McDonald m1 = new McDonald();
		m1.burger();

		Hamburger m2 = new McDonald();
		m2.burger();
	}
}