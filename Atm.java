/*
1- pin -> 3times -> true -> menu()
				 -> false -> exit

2- menu() -> balance
		  -> deposit
		  -> withdraw
		  -> print
		  -> exit
*/

import java.util.Scanner;

public class Atm 
{
	static Scanner scanner = new Scanner(System.in);
	static int balance;
	static int previousTransition;
	static int action;

	public static void main(String[] args)
	{
		int password = 123;
		int pin = 0;

		for(int x=1; x<= 3; x++)
		{
			System.out.print("Enter Pin Number: ");
			pin = scanner.nextInt();

			if(pin == password)
			{
				menu();

				break;
			}
			else
				{
					if(x == 3)
						System.out.println("Incorrectly pin number 3 times");
					else
						System.out.println("Wrong pin number.Please try again");
				}
		}
	}

	public static void menu()
	{
		do {

			System.out.println("=== WELCOME TO BANK ===");
			System.out.println("1) Balance");
			System.out.println("2) Deposit");
			System.out.println("3) Withdraw");
			System.out.println("4) Print");
			System.out.println("5) Transition");
			System.out.println("6) Exit");

			System.out.print("Choose action: ");
			action = scanner.nextInt();

			separateLine();

			switch(action)
			{
				case 1: balance(); break;
				case 2: deposit(); break;
				case 3: withdraw(); break;
				case 4: print(); break;
				case 5: transition(); break;
				case 6: exit(); break;
			}

			separateLine();

		}while( action != 6);
	}

	public static void balance()
	{
		System.out.println("Balance: " + balance);
	}

	public static void deposit()
	{
		System.out.print("Enter the ammount to be deposit: ");
		int deposit = scanner.nextInt();

		balance += deposit;

		previousTransition = +deposit;

		System.out.println("Successful Deposit. ");
	}

	public static void withdraw()
	{
		System.out.println("Enter the ammount to be withdraw: ");
		int withdraw = scanner.nextInt();

		if(withdraw > balance)
		{
			System.out.println("Insufficient money!");
		}
		else
		{
			balance -= withdraw;

			previousTransition = -withdraw;

			System.out.println("Successful withdraw.");
		}
	}

	public static void print()
	{}

	public static void transition()
	{
		if( previousTransition > 0)
			System.out.println("Deposited: " + previousTransition);
		else if( previousTransition < 0)
			System.out.println("Wthdrawl: " + previousTransition);
		else
			System.out.println("No Transition!");
	}

	public static void exit()
	{
		System.out.println("Thank you so much");
	}

	public static void separateLine()
	{
		for(int x=0 ;x<50; x++)
			System.out.print("=");

		System.out.print("\n");
	}
}