//calling super class parameterized constructor from sub class
class One
{
	//super class var
	int i;
	
	//super class para constructor
	One(int i)
	{
		this.i = i;
	}
}

class Two extends One
{
	//sub class var
	int i;
	
	//sub class para constructor
	Two(int a, int b)
	{
		super(a); //call super class constructor and pass a
		i = b; //initialize sub class var
	}
	
	// sub class method
	void show()
	{
		System.out.println("sub class i = " + i);
		System.out.println("super class i = " + super.i);
	}
}

class Super4
{
	public static void main(String args[])
	{
		//create sub class object
		Two t = new Two(11, 22);
		
		//call sub class method
		t.show();
	}
}