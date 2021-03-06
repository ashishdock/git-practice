// another example that uses recursion

class RecTest
{
	int values[];
	
	RecTest(int i)
	{
		values = new int[i];
	}
	
	//display array --recursively
	void printArray(int i)
	{
		if(i==0) return;
		else printArray(i-1);
		System.out.println("[" + (i-1) + "] " + values[i-1]);
	}
}

class Recursion2
{
	public static void main(String args[])
	{
		RecTest ob = new RecTest(10);
		int i, j;
		
		for(i=0, j=19; i<10; i++, j+=5)
			ob.values[i] = j;
		
		ob.printArray(10);
	}
}