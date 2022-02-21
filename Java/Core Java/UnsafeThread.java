//Thread unsafe - Two threads acting on same object

class ReserveUnsafe implements Runnable
{
	//available berths are 1
	int available = 1;
	int wanted;
	
	//accept wanted berths at runtime
	Reserve(int i)
	{
		wanted=i;
	}
	
	public void run()
	{
		//display available berths
		System.out.println("Available Berths = " + available);
		//if available berths are more than or equal to wanted berths
		if(available >= wanted)
		{
			//get the name of passenger
			String name = Thread.currentThread().getName();
			//allot the berth to him
			System.out.println(wanted + " Berths reserved for " + name);
			
			try
			{
				Thread.sleep(1500); //wait for printing the ticket
				available = available - wanted;
				//update the no. of available berths
			}
			catch(InterruptedException ie)
			{
			}
		}
		
		//if available berths are less, display sorry
		else System.out.println("Sorry, no berths!");
	}
}

class UnsafeThread
{
	public static void main(String args[])
	{
		//tell that 1 berth is needed
		Reserve obj = new Reserve(1);
		
		//attach first thread to the object
		Thread t1 = new Thread(obj);
		//attach second thread to the same object
		Thread t2 = new Thread(obj);
		
		//take the thread name as persons names
		t1.setName("First Person");
		t2.setName("Second Person");
		
		//send the requests for berth
		t1.start();
		t2.start();
	}
}