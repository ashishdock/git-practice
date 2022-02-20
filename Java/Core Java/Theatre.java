//Two threads performing two tasks at a time - Theatre example
class MyThread implements Runnable
{
	//declare a string to represent the task
	String str;
	MyThread(String str)
	{
		this.str = str;
	}
	
	public void run()
	{
		for (int i=1; i<=10; i++)
		{
			System.out.println(str + " : " + i);
			try
			{
				Thread.sleep(2000);
				//cease thread execution for 2000 milliseconds
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		} //end of for
	} // end of run()
}

class Theatre
{
	public static void main(String args[])
	{
		//create two objects to represent two tasks
		MyThread obj1 = new MyThread("Cut the ticket");
		MyThread obj2 = new MyThread("Show the seat");
		
		//create two threads and attach them to the two objects
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//start the threads
		t1.start();
		t2.start();
	}
}