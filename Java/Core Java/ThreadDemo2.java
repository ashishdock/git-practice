//To create a thread and run it
// let the class extends Thread or implements Runnable

import java.io.*;

class MyThread extends Thread
{
	boolean stop = false;
	
	//write run() method inside this class 
	public void run()
	{
		//only this code is executed by the thread
		for(int i=1; i<=100000; i++)
		{
			System.out.println(i);
			if(stop) return;
		}
	}
}

class ThreadDemo2
{
	public static void main(String args[]) throws IOException
	{
		//create an object to MyThread class.
		MyThread obj = new MyThread();
		
		//create a thread and attach it to the object of MyThread class.
		Thread t = new Thread(obj);
		
		//now run the thread on the object
		t.start(); //now this thread will execute the code inside run() method of MyThread object
		System.in.read();
		obj.stop = true;
		
	}
}