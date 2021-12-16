//Using the package pack

import testpack.Addition;
import testpack.Subtraction;

class UsePack2
{
	public static void main(String args[])
	{
		Addition obj1 = new Addition(10, 15.5);
		obj1.sum();
		
		Subtraction obj2 = new Subtraction();
		System.out.println("Subtraction using object = " + obj2.sub(10, 5));
		
		double var1 = Subtraction.sub(20, 10);
		System.out.println("Subtraction using variable = " + var1);
	}
}