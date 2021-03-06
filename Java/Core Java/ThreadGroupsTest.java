//Using thread groups

class ThreadGroupsTest
{
	public static void main(String args[])
	{
		//We should understand that the following statements are executed by the main thread
		
		ReservationTG res = new ReservationTG();
		CancellationTG can = new CancellationTG();
		
		//create a threadgroup with name
		ThreadGroup tg = new ThreadGroup("First Group");
		
		//create 2 threads and add them to First Group
		Thread t1 = new Thread(tg, res, "First Thread");
		Thread t2 = new Thread(tg, res, "Second Thread");
		
		//create another thread group tg1 as a child to tg
		ThreadGroup tg1 = new ThreadGroup(tg, "Second Group");
		
		//create 2 threads and add them to second group
		Thread t3 = new Thread(tg1, can, "Third Thread");
		Thread t4 = new Thread(tg1, can, "Fourth Thread");
		
		//find parent group of tg1
		System.out.println("The parent of tg1 is: " + tg1.getParent());
		
		//set maximum priority of tg1 as 7
		tg1.setMaxPriority(7);
		
		//know the thread group of t1 and t3
		System.out.println("The threadgroup of t1 is: " + t1.getThreadGroup());
		System.out.println("The threadgroup of t3 is: " + t3.getThreadGroup());
		
		//start the threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		//find how many threads are actively running
		System.out.println("No. of threads active in tg = " + tg.activeCount());
	}
}

class ReservationTG extends Thread
{
	public void run()
	{
		System.out.println("I am reservation thread.");
	}
}

class CancellationTG extends Thread
{
	public void run()
	{
		System.out.println("I am cancellation thread.");
	}
}