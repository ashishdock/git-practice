//Dynamic Polymorphism
class Sample
{
	//method to add two values
	void add(int a, int b)
	{
		System.out.println("Sum of two = " + (a + b));
	}
	
	//method to add three values
	void add(int a, int b, int c)
	{
		System.out.println("Sum of three = " + (a+b+c));
	}
}

class Polymorph
{
	public static void main(String args[])
	{
		//create Sample class object
		Sample s = new Sample();
		//call add() and pass two values
		s.add(10, 15);
		//call add() and pass three values
		s.add(10, 15, 20);
		
	}
}