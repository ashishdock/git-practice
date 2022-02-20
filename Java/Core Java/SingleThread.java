//single tasking using a thread

class MyThread implements Runnable
{
	public void run()
	{
		//execute the tasks one by one by calling the methods
		task1();
		task2();
		task3();
	}
	
	void task1()
	{
		System.out.println("This is Task 1.");
	}
	
	void task2()
	{
		System.out.println("This is Task 2.");
	}
	
	void task3()
	{
		System.out.println("This is Task 3.");
	}
}

class SingleThread
{
	public static void main(String args[])
	{
		//create an object to MyThread class.
		MyThread obj = new MyThread();
		//create a thread t1 and attach it to that object
		Thread t1 = new Thread(obj);
		//execute the thread t1 on that object run() method.
		t1.start();
	}
}