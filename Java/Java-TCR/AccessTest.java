// This program demonstrates the difference between public and private

class Test3
{
	int a; //default access
	public int b;  //public access
	private int c;  //private access
	
	//methods to access c
	void setc(int i)
	{
		c = i;
	}
	
	int getc() //getc's value
	{
		return c;
	}
}

class AccessTest
{
	public static void main(String args[])
	{
		Test3 ob = new Test3();
		
		//These are OK, a and b may be accessed directly
		ob.a = 10;
		ob.b = 20;
		
		//This is not OK and will cause an error
		//ob.c = 100; //Error;
		
		// You must access c through its methods
		ob.setc(100); //OK
		System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
	}
}