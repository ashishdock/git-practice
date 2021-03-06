//Thread Deadlock

class BookTicket extends Thread
{
	//we are assuming train, compartment as objects
	Object train, comp;
	
	BookTicket(Object train, Object comp)
	{
		this.train = train;
		this.comp = comp;
	}
	
	public void run()
	{
		//lock on train
		synchronized(train)
		{
			System.out.println("BookTicket locked on Train.");
			try
			{
				Thread.sleep(150);
			}
			catch(InterruptedException ie)
			{
			}
			System.out.println("Bookticket now waiting to lock on compartment...");

			synchronized(comp)
			{
				System.out.println("BookTicket locked on compartment.");
			}
		}
	}
}
class CancelTicket extends Thread
{
	//we are assuming train, compartment as objects
	Object train, comp;
	
	CancelTicket(Object train, Object comp)
	{
		this.train = train;
		this.comp = comp;
	}
	
	public void run()
	{
		//lock on compartment
		synchronized(comp)
		{
			System.out.println("Cancel Ticket locked on compartment.");
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException ie)
			{}
			
			System.out.println("CancelTicket now waiting to lock on train...");
			
			synchronized(train)
			{
				System.out.println("CancelTicket locked on train");
			}
		}
	}
}

class DeadLock
{
	public static void main(String args[])
	{
		//take train, compartment as objects of Object class
		Object train = new Object();
		Object compartment = new Object();
		
		//create objects to Bookticket, CancelTicket classes
		BookTicket obj1 = new BookTicket(train, compartment);
		CancelTicket obj2 = new CancelTicket(train, compartment);
		
		//attach 2 threads to these objects
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		//run the threads on the objects
		t1.start();
		t2.start();
	}
}