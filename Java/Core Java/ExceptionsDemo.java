//Exception handling using try, catch and finally blocks
class ExceptionsDemo
{
	public static void main(String args[])
	{
		try
		{
			//open files
			System.out.println("Open files");
			
			//do some processing
			int n = args.length;
			System.out.println("n = " + n);
			int a = 45/n;
			System.out.println("a = " + a);
		}
		catch(ArithmeticException ae)
		{
			//display the exception details
			System.out.println(ae);
			
			//display any message to the user
			System.out.println("Please pass data while running this program");
			
		}
		finally
		{
			//close the files
			System.out.println("Close files!");
		}
	}
}