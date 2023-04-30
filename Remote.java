public class Remote
{
	String charge;
	boolean power = false;
	int volume = 30;

	public void powerOn()
	{
		power = true;
	}
	public void powerOff()
	{
		power = false;
	}
	
	public void volumeUp()
	{
		volume--;
	}

	public void volumeDown()
	{
		volume++;
	}
}