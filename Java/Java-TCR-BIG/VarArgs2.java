// Here varargs with standard arguments

class VarArgs2
{
	// Here, msg is a normal paramter and v is a varargs parameter
	static void vaTest(String msg, int ...v)
	{
		System.out.print(msg + v.length + " Contents: ");
		
		for(int x: v)
			System.out.print(x + " ");
		
		System.out.println();
	}
	
	public static void main(String args[])
	{
		vaTest("One varargs: ", 10);
		vaTest("Three Varargs: ", 1, 2, 3);
		vaTest("No Varargs: ");
	}
}