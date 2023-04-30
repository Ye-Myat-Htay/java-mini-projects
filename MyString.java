public class MyString
{
	public static void main(String[] d)
	{
		String message = " Hello, World ";
		message = message.trim();
		System.out.println("Length: " + message.length());

		char c = message.charAt(7);
		System.out.println("Char At: " + c);

		String firstName = "John";
		String lastName = "Doe";

		//String userName = firstName + " " + lasrName;
		String userName = firstName.concat(" ").concat(lastName).toUpperCase();
		System.out.println(userName);

		int i = 1500;
		// Convert Int to String
		String s = Integer.toString(i);

		System.out.println( s + 528 );
	}
}