// A program to use the @Override annotation to check whether the sub class method really overrides the super class method or not
//Let us write a super class with a method inside it

class One
{
	void doSomething()
	{
		System.out.println("Hai");
	}
}

//The sub class method should override the super class method.

class Two extends One
{
	@Override
	void doSomething()
	{
		System.out.println("Hello");
	}
}

public class TestAnno
{
	public static void main(String args[])
	{
		Two t = new Two();
		t.doSomething();
	}
}