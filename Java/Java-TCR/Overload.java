// Demonstrate method overloading

class OverloadDemo
{
	void test()
	{
		System.out.println("No parameters.");
	}
	
	//Overload test for one integer parameter
	void test(int a)
	{
		System.out.println("a: " + a);
	}
	
	//Overload test for two integer parameters
	void test(int a, int b)
	{
		System.out.println("a and b: " + a + " " + b);
	}
	
	//Overload test for two integer parameters
	double test(double a)
	{
		System.out.println("double a: " + a);
		return a*a;
	}
}

class Overload
{
	public static void main(String args[])
	{
		OverloadDemo ob = new OverloadDemo();
		double result;
		
		//call all versions of test
		ob.test();
		ob.test(9);
		ob.test(3, 9);
		result = ob.test(1.9);
		System.out.println("Result of ob.test(1.9): " + result);
		
	}
}