//Thread Priorities
class MyClassPrior extends Thread
{
	int count = 0; //this counts numbers
	
	public void run()
	{
		for(int i=1; i<=100000; i++)
		count++; //counts number upto 10000
		
		//display which thread has completed counting and its priority
		System.out.println("Completed Thread: " + Thread.currentThread().getName());
		System.out.println("It's Priority: " + Thread.currentThread().getPriority());
	}
}

class PriorityTest
{
	public static void main(String args[])
	{
		MyClassPrior obj = new MyClassPrior();
		
		//create two threads
		Thread t1 = new Thread(obj, "One");
		Thread t2 = new Thread(obj, "Two");
		
		//set priorities for them
		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY); //this means priority no. 5
		
		//start first t1 and then t2
		t1.start();
		t2.start();
	}
}