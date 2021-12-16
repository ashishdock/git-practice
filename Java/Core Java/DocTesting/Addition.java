//Addition.java

/** This package is useful to perform some arithmetic calculations. It has two classes by the name Addition and Subtraction. */

//STEP 1: creating a package pack with Addition class

package testpack; //testpack is the packagename

/** This class is useful to find sum of two numbers. It has a parameterized constructor and a method to find sum.*/

public class Addition
{
	//instance vars
	private double d1, d2;
	
	/** This is a parameterized constructor to initialize the instance variables of the class. */
	
	public Addition(double a, double b)
	{
		d1 = a;
		d2 = b;
	}
	
	/** This method is useful to find sum of two numbers. It does not accept any parameters.
	<br> Parameters: nil
	<br> Return type: void
	<br> Exceptions: nil	
	*/
	
	//method to find sum of two numbers
	public void sum()
	{
		System.out.println("Sum = " +(d1+d2));
	}
}