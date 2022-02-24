// A generic class - to store any type of object. Here, T is generic parameter which determines the data type

class MyClass<T>
{
	//declare T type object
	T obj;
	
	// a constructor to initialize T type object
	MyClass(T obj)
	{
		this.obj = obj;
	}
	
	// a method which returns T type object
	T getobj()
	{
		return obj;
	}
}

class Gen1
{
	public static void main(String args[])
	{
		//create Integer class object
		Integer i = 12; //this is same as: Integer i = new Integer(12);
		
		//create MyClass object and store Integer object in it
		MyClass<Integer> obj = new MyClass<>(i);
		
		//retrieve Integer objects by calling getobj()
		System.out.println("You Stored: " + obj.getobj());
		
		//In the same way, use MyClass for storing Float object and retrieve it
		Float f = 12.123f;  //Same as: Float f = new Float(12.123f);
		MyClass<Float> obj1 = new MyClass<>(f);
		System.out.println("You stored: " + obj1.getobj());
		
		//we can use MyClass to store String type data also
		MyClass<String> obj2 = new MyClass<>("Ravi Kumar");
		System.out.println("You stored: " + obj2.getobj());
	}
}