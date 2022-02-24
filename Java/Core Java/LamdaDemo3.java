// A lambda expression that returns square root value of a number

class LamdaDemo3
{
	//create a functional interface with a single abstract method
	
	interface MyInter
	{
		double squareRoot(double num);
	}
	
	public static void main(String args[])
	{
		//create functional interface reference that refers to lambda expression
		MyInter mi = (double x) -> {return Math.sqrt(x);};
		
		//call the method using reference
		System.out.println("Square Root of 256 is " + mi.squareRoot(256));
	}
}