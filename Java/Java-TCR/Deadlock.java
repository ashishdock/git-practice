// An example of Deadlock
class A
{
	synchronized void foo(B b)
	{
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " entered A.foo");
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			System.out.println("A interrupted.");
		}
		
		System.out.println(name + " trying to call B.last()");
		b.last();
	}
	
	synchronized void last()
	{
		System.out.println("Inside A.last");
	}
}

class B
{
	synchronized void bar(A a)
	{
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " entered B.bar");
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("B interrupted");
		}
		
		System.out.println(name + " trying to call A.last()");
		a.last();
	}
	
	synchronized void last()
	{
		System.out.println("Inside B.last");
	}
}

class Deadlock implements Runnable
{
	A a = new A();
	B b = new B();
	Thread t;
	
	Deadlock()
	{
		Thread.currentThread().setName("MainThread");
		t = new Thread(this, "Racing Thread");
	}
	
	void deadlockStart()
	{
		t.start();
		a.foo(b);	//get lock on a in this thread
		System.out.println("Back in main thread");
	}
	
	public void run()
	{
		b.bar(a); 	// get lock on b in other thread
		System.out.println("Back in other thread");
	}
	
	public static void main(String args[])
	{
		Deadlock d1 = new Deadlock();
		d1.deadlockStart();
	}
}