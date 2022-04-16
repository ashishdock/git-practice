// This program will not compile

class Outer1
{
	int outer_x = 100;
	
	void test()
	{
		Inner1 inner = new Inner1();
		inner.display();
	}
	
	//this is an inner class
	class Inner1
	{
		int y =10; //y is local to inner
		
		void display()
		{
			System.out.println("display: outer_x = " + outer_x);
		}
	}
	
	void showy()
	{
		System.out.println(y);
	}
}

class InnerClassDemo1
{
	public static void main(String args[])
	{
		Outer1 outer = new Outer1();
		outer.test();
	}
}