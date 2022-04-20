// An example of Phaser.

import java.util.concurrent.*;

class PhaserDemo
{
	public static void main(String args[])
	{
		Phaser phsr = new Phaser(1);
		int curPhase;
		
		System.out.println("Starting");
		
		new Thread(new MyThread(phsr, "A")).start();
		new Thread(new MyThread(phsr, "B")).start();
		new Thread(new MyThread(phsr, "C")).start();
		
		// Wait for all threads to complete phase one.
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		
		// Wait for all threads to complete phase two.
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		
		// Deregister the main method
		phsr.arriveAndDeregister();
		
		if(phsr.isTerminated())
			System.out.println("The Phaser is terminated");
	}
}

// A thread of execution that uses a Phaser.
class MyThread implements Runnable
{
	Phaser phsr;
	String name;
	
	MyThread(Phaser p, String n)
	{
		phsr = p;
		name = n;
		phsr.register();
	}
	
	public void run()
	{
		System.out.println("Thread " + name + " Beginning Phase One");
		phsr.arriveAndAwaitAdvance();	// Signal arrival.
		
		// Pause a bit to prevent jumbled output. This is for illustration only. It is not required for the proper operation of the phaser.
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		
		System.out.println("Thread " + name + " Beginning Phase Two");
		phsr.arriveAndAwaitAdvance();	// Signal arrival
		
		// Pause a bit to prevent jumbled output. This is for illustration only. It is not required for the proper operation of the phaser.
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		
		System.out.println("Thread " + name + " Beginning Phase Three");
		phsr.arriveAndDeregister();	// Signal arrival and deregister
	}
}