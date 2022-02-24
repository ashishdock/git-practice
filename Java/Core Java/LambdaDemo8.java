// A thread program to display a message by using anonumous inner class
//A simple thread program - version 3

class LambdaDemo8
{
	public static void main(String args[])
	{
		//create a thread object and pass the object of anonymous class
		Thread t = new Thread(new Runnable()
		{
			//implement the run() of the runnable interface
			public void run()
			{
				System.out.println("This is from anonymous innner class.");
			}
		});
		
		//run the thread
		t.start();
	}
}