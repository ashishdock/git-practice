//A simple thread program - version 4
//in this version, we are passing lambda expression the Thread class object

class LambdaDemo9
{
	public static void main(String args[])
	{
		//create thread object and pass lambda expression
		Thread t = new Thread(
		//lambda expression to implement run() method
		() -> {System.out.println("This is from lambda expression.");}
		);
		
		//run the thread
		t.start();
	}
}