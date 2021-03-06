// A program to understand how to use double colon operator as a reference to a method

class DColonDemo1
{
	static void display()
	{
		System.out.println("Hello from display");
	}
	
	public static void main(String args[])
	{
		//lambda expression represents the run() method of Runnable
		Runnable r1 = () -> System.out.println("Hello from Lambda");
		r1.run();
		
		//double colon refers the display() method of DColonDemo1 class
		Runnable r2 = DColonDemo1::display;
		r2.run();
	}
}