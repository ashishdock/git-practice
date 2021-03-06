//Handling multiple exceptions using try, catch and finally blocks
class ExceptionsDemo1
{
	public static void main(String args[])
	{
		try
		{
			//open the files
			System.out.println("Open files!");
			
			//do some processing
			int n = args.length;
			System.out.println("n = " + n);
			int a = 45/n;
			System.out.println("a = " + a);
			int b[] = {10, 20, 30}; //arrays are not dynamic
			b[50] = 100; //this will not work
		}
		catch(ArithmeticException ae)
		{
			//display the exception details
			System.out.println(ae);
			//display any message to user
			System.out.println("Please pass data while running this program");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			//display exception details
			System.out.println(aie);
			//display a message to user
			System.out.println("Please see that the array index is within the range.");
		}
		finally
		{
			//close the files
			System.out.println("Close files!");
		}
		
		//Even if there is scope for multiple exceptions, only one exception at a time will occur. In thenext program we will merge these two catch blocks
	}
}