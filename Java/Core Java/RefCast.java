//Widening using referenced data types
class One
{
	void show1()
	{
		System.out.println("Super Class Method");
	}
}

class Two extends One
{
	void show2()
	{
		System.out.println("Sub class method");
	}
}

class RefCast
{
	public static void main(String args[])
	{
		One o; //o is the super class reference
		//o = (One)new Two(); //o is referencing to sub class object
		o = new Two();
		//the above is widening
		o.show1();
		
	}
}