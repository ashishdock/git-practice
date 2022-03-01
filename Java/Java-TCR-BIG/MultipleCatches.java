//Demonstrate  multiple catch statements
class MultipleCatches
{
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = {1};	//These statements only get 
			c[42] = 99;		//executed if a is not equal to 0
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0: " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index oob: " + e);
		}
		System.out.println("After try/catch blocks.");
	}
}