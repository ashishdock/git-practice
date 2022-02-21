//Fixed thread pool example

import java.util.concurrent.*;

//a class that represents the task to be executed
class Tasks implements Runnable
{
	private int taskno;
	
	Tasks (int taskno)
	{
		this.taskno = taskno;
	}
	
	public void run()
	{
		for(int i=0; i<=100; i+=25)
		{
			//find the currently running thread's name
			String name = Thread.currentThread().getName();
			
			//display the thread name that is performing the task
			System.out.println( name + " completed task " + taskno + " by " + i + " percent.");
			try
			{
				Thread.sleep(3000); //this task is taking 3 seconds
			}
			catch(InterruptedException ie){}
		}
	}
}

class ThreadPoolDemo
{
	public static void main(String args[])
	{
		//fixed thread pool is created with 2 threads
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		/* number of tasks are 4. Create tasks type array with size 4 t[0] to t[3] represent the four tasks */
		
		Tasks t[] = new Tasks[4];
		
		//execute the 4 tasks
		for(int i=0; i<4; i++)
		{
			//attach task to the array reference
			t[i] = new Tasks(i);
			
			//execute the task shown by array reference
			es.execute(t[i]);
		}
		
		//close the old tasks and do not accept new tasks
		es.shutdown();
	}
}