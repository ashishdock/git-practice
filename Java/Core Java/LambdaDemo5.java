// Passing lambda expression as an argument to a method
// we are going to calculate area of a circle

class LambdaDemo5
{
	//create a functional interface with one abstract method
	interface Circle
	{
		void calculate(double radius);
	}
	
	//a method with functional interface reference ref as its argument
	void circleArea(double radius, Circle ref)
	{
		ref.calculate(radius);  //this will execute the lambda expression
	}
	
	public static void main(String args[])
	{
		//create object to the class
		LambdaDemo5 obj = new LambdaDemo5();
		
		//let the functional interface reference refer to the lambda expression
		//this lambda expression implements calculate(radius) method
		Circle ref = (r) -> {System.out.println("Area = " + Math.PI*r*r);};
		
		//call the method, pass radius and lambda expression as arguments
		obj.circleArea(20, ref);
	}
}