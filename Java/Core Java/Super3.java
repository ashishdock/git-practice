//calling super class default constructor from sub class
class One
{
	One()
	{
		System.out.println("Super Class Constructor: ONE");
	}
}

class Two extends One
{
	Two()
	{
		System.out.println("Sub class constructor: TWO");
	}
}

class Super3
{
	public static void main(String args[])
	{
		//create sub class object
		Two t = new Two();
	}
}