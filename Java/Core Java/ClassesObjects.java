//All the objects sharing the same method
class MyClass
{
	//method to calculate square value
	void calculate(double x)
	{
		System.out.println("Square = " + (x*x));
	}
}

class ClassesObjects
{
	public static void main(String args[])
	{
		//create 3 objects
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		MyClass obj3 = new MyClass();
		
		//call calculate() method from the objects
		obj1.calculate(3);
		obj2.calculate(4);
		obj3.calculate(5);
	}
}