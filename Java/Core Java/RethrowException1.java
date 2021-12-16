//Rethrowing an exception
class RethrowExc
{
	void method1()
	{
		try
		{
			//take a string with 5 chars. Their index will be from 0 to 4.
			String str = "Hello";
			
			//exception is thrown in below statement because there is no index with value 5
			char ch = str.charAt(5);
		}
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("Please see the index is within the range");
			throw sie; //rethrow the exception, if you comment this out the catch in below class won't catch it and won't display it's message.
		}
	}
}

class RethrowException1 
{
	public static void main(String args[])
	{
		//create an object to A and call method1().
		RethrowExc obj = new RethrowExc();
		try
		{
			obj.method1();
		}
		//the rethrown exception is caught by the below catch block
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("I caught rethrown exception");
		}
	}
}