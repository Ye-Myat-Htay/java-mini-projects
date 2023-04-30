public class CheckFirstName
{
	public static void main(String[] d)
	{
		String[] name = {
			"John Doe",
			"john Doe",
			"Doe Doe",
			"Doe John",
			"JohN Doe John"
		};
		
		for(int x=0; x<name.length; x++)
		{
			//if(name[x].equals("John Doe"))
			if(name[x].toLowerCase().startsWith("john"))
			{
				System.out.println(name[x]);
			}
		}
	}
}