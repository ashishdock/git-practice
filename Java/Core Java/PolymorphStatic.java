//Static Polymorphism

class One
{
	//method to calculate square value
	static void calculate(double x)
	{
		System.out.println("Square value = " + (x*x));
	}
}

class Two extends One
{
	//method to calculate square root value
	static void calculate(double x)
	{
		System.out.println("Square root = " + Math.sqrt(x));
	}
}

class PolymorphStatic
{
	public static void main(String args[])
	{
		//Super class reference refers to sub class object
		One o = new Two();
		//call calculate() method using super class reference 
		o.calculate(25);
	}
}