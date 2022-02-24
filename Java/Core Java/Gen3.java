//A generic interface

interface Fruit<T>
{
	//method that accepts any object
	void tellTaste(T fruit);  //public abstract
}

//this class implements Fruit interface
class AnyFruit<T> implements Fruit<T>
{
	public void tellTaste(T fruit)
	{
		//know the class name of the object passed to this method
		String fruitname = fruit.getClass().getName();
		
		//then decide the taste and display
		if(fruitname.equals("Banana"))
			System.out.println("Banana is sweet");
		if(fruitname.equals("Orange"))
			System.out.println("Orange is sour");
	}
}

class Banana
{}

class Orange
{}

class Gen3
{
	public static void main(String args[])
	{
		//create Banana object and pass it to AnyFruit class
		Banana b = new Banana();
		AnyFruit<Banana> fruit1 = new AnyFruit<>();
		fruit1.tellTaste(b);
		
		//create Orange object and pass it to AnyFruit class
		Orange o = new Orange();
		AnyFruit<Orange> fruit2 = new AnyFruit<>();
		fruit2.tellTaste(o);
	}
}