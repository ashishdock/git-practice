// Parts of the for loop can be empty
class ForVar
{
	public static void main(String args[])
	{
		int i;
		boolean done = true;
		
		i = 0;
		for(;done;)
		{
			System.out.println("i is " + i);
			if(i == 10) done = false;
			i++;
		}
	}
}