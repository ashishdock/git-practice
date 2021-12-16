//STEP 2: Using the package testpack

import testpack.Addition;

class UsePack1
{
	public static void main(String args[])
	{
		//create Addition class object
		Addition obj = new Addition(10, 15.5);
		
		//call the sum() method
		obj.sum();
	}
}
