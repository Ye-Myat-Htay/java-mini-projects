class SalaryWithBonus
{
	public static void main(String[] args)
	{
		int salary = 5100;
		int bonus =50;
		if(salary >= 5000)
		{
			if(salary == 5100)
			{
				salary += bonus;
				System.out.println("You got salary with bonus " + salary);
			}
			else
			{
				System.out.println("Your salary is " + salary);
			}
		}
		else 
		{
			System.out.println("You need to more hard work!");
		}
	}
}