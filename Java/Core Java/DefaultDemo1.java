// an interface with a default method

interface MyInter
{
	int add(int x, int y);   //this is public and abstract
	
	default int mult(int x, int y)
	{
		return(x*y);
	}
}

class A implements MyInter
{
	public int add(int x, int y)
	{
		return(x + y);
	}
}

class DefaultDemo1
{
	public static void main(String args[])
	{
		//interface reference can refer to object of its implementation classes
		MyInter mi = new A();
		System.out.println("Sum =" + mi.add(10, 15));
		
		//default method is by default available in implementation class
		System.out.println("Product = " + mi.mult(10,15));
	}
}