// Example to understand deprecated annotation

class MyClassDepAnno
{
	@Deprecated
	void myMethod()
	{
		System.out.println("This method is deprecated.");
	}
}

class DeprecatedTest
{
	public static void main(String args[])
	{
		MyClassDepAnno obj = new MyClassDepAnno();
		obj.myMethod();
	}
}