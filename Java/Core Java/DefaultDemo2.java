// A program to understand how to refer to a particular default method when the same method is found in two interfaces.

interface One
{
	default void message()
	{
		System.out.println("Hello from One");
	}
}

interface Two
{
	default void message()
	{
		System.out.println("Hello from Two");
	}
}

class Implclass implements One, Two
{
	//override the message() method to resolve the confusion
	public void message()
	{
		Two.super.message(); //this will call Two's message()
	}	
}

class DefaultDemo2
{
	public static void main(String args[])
	{
		//create implmentation class object
		Implclass ic = new Implclass();
		ic.message();
	}
}