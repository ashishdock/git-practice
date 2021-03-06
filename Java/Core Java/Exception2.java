//Handling multiple exceptions in the same catch block
class Exception2
{
	public static void main(String args[])
	{
		try
		{
			//open the files
			System.out.println("Open files");
			//do some processing
			int n = args.length;
			System.out.println("n = " + n);
			int a = 45/n;
			System.out.println("a = "+ a);
			int b[] = {10, 20, 30};
			b[50] = 100;
		}
	
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ae)
		{
			//as soon as the first exception is raised anything after that is not encountered hence only one exception is raised at a time
			//display the exception details
			System.out.println(ae);
		}
		finally
		{
			//close the files
			System.out.println("Close files!");
		}
	}
}