//Using getClass() to know the classname
//MyClass stores an int value
class MyClass
{
	int x;
	MyClass(int x)
	{
		this.x = x;
	}
}
//This class contains method to receive an object and display the classname 
class KnowName
{
	static void printName(Object obj)
	{
		//get the class name into an object c of the class class
		Class c = obj.getClass();
		//get the name of the class using getName()
		String name = c.getName();
		System.out.println("The classname = " + name);
	}
}
class ClassName1
{
	public static void main(String args[])
	{
		//create MyClass object obj
		MyClass obj = new MyClass(10);
		//know the class name of the object obj by calling printName()
		KnowName.printName(obj);
	}
}