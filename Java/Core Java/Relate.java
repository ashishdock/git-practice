//Relating class Two with class One
class One
{
	//instance variables
	int x;
	Two t;	//class Two's reference
	
	//constructor that receives Two's reference
	One(Two t)
	{
		//copy Two's reference into t
		this.t = t;
		x = 10;
	}
	
	//method to display class One and class Two vars
	void display()
	{
		System.out.println("One's x = " + x);
		//call class Two's method
		t.display();
		//access class Two's var
		System.out.println("Two's var = " + t.y);
	}
}

class Two
{
	//instance variable
	int y;
	
	//initialize y;
	Two(int y)
	{
		this.y = y;
	}
	
	//method to display y
	void display()
	{
		System.out.println("Two's y = " + y);
	}
}

class Relate
{
	public static void main(String args[])
	{
		//create class Two object and store 22 there.
		Two obj2 = new Two(22);
		//create class One object and pass class Two object to it
		One obj1 = new One(obj2);
		//call class One's method
		obj1.display();
	}
}