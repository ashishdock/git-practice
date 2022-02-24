// A lambda expression that accesses the variables with class scope and method

class LambdaDemo4
{
	//variable in the class
	int x = 10;
	
	//method in the class
	void method()
	{
		//variable in the method
		int x = 20;
		
		//create reference of functional interface to the lambda expression
		Runnable r = () -> {System.out.println("Var of the class = " + this.x);
		System.out.println("Var of the method = " + x);};
		
		//create a thread and run it
		Thread t = new Thread(r);
		t.start();
	}
	
	public static void main(String args[])
	{
		//create object to the class and call the method
		LambdaDemo4 obj = new LambdaDemo4();
		obj.method();
	}
}