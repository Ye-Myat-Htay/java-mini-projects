public class TernaryOperator
{
	public static void main(String[] args)
	{
	int firstNum = 10, secondNum;
	secondNum = (firstNum==1) ? 20 : 30;
	System.out.println("Value of secondNum is " + secondNum);
	secondNum = (firstNum==10) ? 20:30;
	System.out.println("Value of secondNum is " + secondNum);
	}
}