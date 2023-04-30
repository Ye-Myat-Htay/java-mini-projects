public class VariableType
{
	// static
	static int staticVar = 7;

	// instance (object)
	int nonStaticVar = 5;

	public static void main(String[] args)
	{
		int localVar = 10;
		System.out.println( "Static Var: " + VariableType.staticVar );
		System.out.println( "StaticVar:" + staticVar );

		VariableType vt = new VariableType();
		System.out.println("Non-Static Var: " + vt.nonStaticVar );
	}
}