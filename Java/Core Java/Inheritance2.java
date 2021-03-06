//shape is the super class for square
//And Square is the super class for Rectangle

class Shape
{
	//take protected type var
	protected double l;
	
	//parameterized constructor
	Shape(double l)
	{
		this.l = l;
	}
}

class Square extends Shape
{
	
	//constructor using super
	Square(double x)
	{
		super(x);
	}
	
	void area()
	{
		//because of inheritance
		System.out.println("Area of the square is: " + (l*l));
	}
}

class Rectangle extends Square
{
	private double b;
	
	Rectangle(double x, double y)
	{
		super(x);
		b = y;
	}
	
	void area()
	{
		System.out.println("Area of the rectangle is: " + (l*b));
	}
}

class Inheritance2
{
	public static void main(String args[])
	{
		
		Square sq = new Square(5);
		Rectangle rect = new Rectangle(4, 3);
		sq.area();
		rect.area();
	}
}