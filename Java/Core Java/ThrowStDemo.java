//using throw clause, the throw statement
class ThrowStatement
{
	static void demo()
	{
		try
		{
			System.out.println("Inside demo()");
			throw new NullPointerException("Exception data");
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
	}
}

class ThrowStDemo
{
	public static void main(String args[])
	{
		ThrowStatement.demo();
	}
}