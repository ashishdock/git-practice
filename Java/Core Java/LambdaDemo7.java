// A thread program to display a message, where a separate implementation class Runnable interface is created
// A simple thread program - version 2
// In this version we are separately creating implementation class of Runnable interface

class LambdaDemo7
{
	public static void main(String args[])
	{
		//create thread object and pass the object of implementation class of Runnable interface
		Thread t = new Thread(new ImplClass());
		
		//run the thread
		t.start();
	}
}

//this is the implementation class for the Runnable Interface
class ImplClass implements Runnable
{
	//implement the run() of the Runnable Interface
	public void run()
	{
		System.out.println("This is from implementation class");
	}
}