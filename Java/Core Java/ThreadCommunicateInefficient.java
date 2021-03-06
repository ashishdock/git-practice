/* This program shows how two threads can communicate with each other.
This is inefficient way of communication. */

class ThreadCommunicateInefficient
{
	public static void main(String args[]) throws Exception
	{
		//Producer produces some data which Consumer consumes
		ProducerIneff obj1 = new ProducerIneff();
		//Pass Producer object to Consumer so that it is then available to Consumer
		ConsumerIneff obj2 = new ConsumerIneff(obj1);
		//create 2 threads and attach to Producer and Consumer
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//Run the threads
		t2.start(); //Consumer waits
		t1.start(); //Producer starts production
	}
}

class ProducerIneff extends Thread
{
	// to add data, we use string buffer object
	StringBuffer sb;
	
	//dataprodover will be true when data production is over
	boolean dataprodover = false;
	
	ProducerIneff()
	{
		sb = new StringBuffer(); //allot memory
	}
	
	public void run()
	{
		// go on appending data (numbers) to string buffer
		for(int i = 1; i<=10; i++)
		{
			try
			{
				sb.append(i + ":");
				Thread.sleep(100);
				System.out.println("appending");
			}
			catch(Exception e){}
		}
		
		//data production is over, so store true into dataprodover
		dataprodover = true;
	}
}

class ConsumerIneff extends Thread
{
	//create Producer reference to refer to Producer object from Consumer class
	
	ProducerIneff prod;
	
	ConsumerIneff(ProducerIneff prod)
	{
		this.prod = prod;
	}
	
	public void run()
	{
		//if data production is not over, sleep for 10 milliseconds and check again. Here there is a time delay of several milliseconds to receive data
		try
		{
			while(!prod.dataprodover)
			{
				Thread.sleep(10);
			}
		}
		catch(Exception e){}
		// when data production is over, display data of stringbuffer
		System.out.println(prod.sb);
	}
}