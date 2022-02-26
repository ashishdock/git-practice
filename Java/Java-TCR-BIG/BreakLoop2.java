//Using break to exit a while loop

class BreakLoop2
{
	public static void main(String args[])
	{
		int i = 0;
		
		while(i<100)
		{
			if(i==10) break;  //terminate the loop is i is 10
			System.out.println("i: " + i);
			i++;
		}
		System.out.println("Loop Complete.");
	}
}