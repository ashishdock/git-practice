// A server with 2 threads to contact multiple clients

import java.io.*;
import java.net.*;

class MultiServe implements Runnable
{
	static ServerSocket ss;
	static Socket s;
	
	public void run()
	{
		//find thread name
		String name = Thread.currentThread().getName();
		for(;;) // Server runs continuously
		{
			try
			{
				System.out.println("Thread " + name + " ready to accept...");
				s = ss.accept();
				System.out.println("Thread " + name + " accepted a connection.");
				//for sending message
				PrintStream ps = new PrintStream(s.getOutputStream());
				ps.println("Thread " + name + " contacted you.");
				
				//close connection
				ps.close();
				s.close();
				//do not close ServerSocket.
			}
			catch(Exception e){}
		}
	}
	
	public static void main(String args[]) throws Exception
	{
		MultiServe ms = new MultiServe();
		
		//create server socket with 999 as port number
		ss = new ServerSocket(999);
		
		//create 2 threads
		Thread t1 = new Thread(ms, "One");
		Thread t2 = new Thread(ms, "Two");
		
		//start the threads
		t1.start();
		t2.start();
	}
}