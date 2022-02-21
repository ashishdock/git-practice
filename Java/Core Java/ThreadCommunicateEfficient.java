/* This program shows how two threads can communicate with each other.
This is inefficient way of communication. */

class ThreadCommunicateEfficient
{
	public static void main(String args[]) throws Exception
	{
		//Producer produces some data which Consumer consumes
		ProducerEff obj1 = new ProducerEff();
		//Pass Producer object to Consumer so that it is then available to Consumer
		ConsumerEff obj2 = new ConsumerEff(obj1);
		//create 2 threads and attach to Producer and Consumer
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//Run the threads
		t2.start(); //Consumer waits
		t1.start(); //Producer starts production
	}
}

class ProducerEff extends Thread
{
	// to add data, we use string buffer object
	StringBuffer sb;
	
	ProducerEff()
	{
		sb = new StringBuffer(); //allot memory
	}
	
	public void run()
	{
		synchronized(sb)
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
			
			//data production is over, so notify to Consumer thread
			sb.notify();
		}
	}
}

class ConsumerEff extends Thread
{
	//create Producer reference to refer to Producer object from Consumer class
	
	ProducerEff prod;
	
	ConsumerEff(ProducerEff prod)
	{
		this.prod = prod;
	}
	
	public void run()
	{
		synchronized(prod.sb)
		{
			//wait till a notification is received from Producer thread. Here there is no wastage of time of even a single millisecond
			
			try
			{
				prod.sb.wait();
			} catch(Exception e) {}
			
			//when data production is over, display data of string buffer
			System.out.println(prod.sb);
		}
	}
}