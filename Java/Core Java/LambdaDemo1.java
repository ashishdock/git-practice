// A program to create a lambda expression that displays a Hello Message. Call and execute the expression using functional interface reference
// A lambda expression to display Hello Message

class LambdaDemo1
{
	//create a functional interface with a single abstract method
	interface MyInter
	{
		void message();
	}
	
	public static void main(String args[])
	{
		//create functional interface reference that refers to lambda expression
		MyInter mi = () -> {System.out.println("Hello how are you? ");};
		
		//call the method using reference
		mi.message();
	}
}