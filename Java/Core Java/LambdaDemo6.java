// A program to display a message using a thread
// A simple thread program - version 1

class LambdaDemo6 implements Runnable
{
	//implements the run() of the Runnable interface
	public void run()
	{
		System.out.println("This is from thread.");
	}
	public static void main(String args[])
	{
		//create an object to the class
		LambdaDemo6 obj = new LambdaDemo6();
		
		//attach thread to the object
		Thread t = new Thread(obj);
		
		//run the thread on object
		t.start();
	}
}