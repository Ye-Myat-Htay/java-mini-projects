import java.util.Scanner;

public class BasicScanner
{
	public static void main(String[] d)
	{
										//Get form user input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.println("Hello, " + name);

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		System.out.println("I'm " + age + "years old. ");

		//scanner.nextLine();
	}
}

//HW Calculator /enter first number /(int num1,num2)
//                    second
//choose operator (+-*/) string o
// switch codition 


//HW HotelReservation.java
//Enter Customer name String name
//Choose room type (1,2,3)
//Enter total room (1,2,3,......)
//if room type==1 >> 120*totalroom