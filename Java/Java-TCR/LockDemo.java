// A simple lock example

import java.util.concurrent.locks.*;

class LockDemo
{
	public static void main(String args[])
	{
		ReentrantLock lock = new ReentrantLock();
		
		new Thread(new LockThread(lock, "A")).start();
		new Thread(new LockThread(lock, "B")).start();
	}
}

// A shared resource.
class Shared
{
	static int count = 0;
}

// A thread of execution that increments count.
class LockThread implements Runnable
{
	String name;
	ReentrantLock lock;
	
	LockThread(ReentrantLock lk, String n)
	{
		name = n;
		lock = lk;
	}
	
	public void run()
	{
		System.out.println("Starting " + name);
		
		try
		{
			// First, lock count.
			System.out.println(name + " is waiting to lock count.");
			lock.lock();
			System.out.println(name + " is locking count.");
			
			Shared.count++;
			System.out.println(name + ": " + Shared.count);
			
			// Now, allow a context switch -- if possible.
			System.out.println(name + " is sleeping.");
			Thread.sleep(5000);
		}
		catch(InterruptedException exc)
		{
			System.out.println(exc);
		}
		finally
		{
			// Unlock
			System.out.println(name + " is unlocking count.");
			lock.unlock();
		}
	}
}