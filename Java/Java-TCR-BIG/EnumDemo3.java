// Use an enum constructor, instance variable, and method.
enum Apple
{
	Jonathan(10), GoldenDel(9), RedDEl(12), Winesap(15), Cortland(8);
	
	private int price;	//price of each apple
	
	//contructor
	Apple (int p)
	{
		price = p;
	}
	
	int getPrice()
	{
		return price;
	}
}

class EnumDemo3
{
	public static void main(String args[])
	{
		Apple ap = Apple.Winesap;
		
		//display price of Winesap
		System.out.println("Winesap costs " + ap.getPrice() + " cents.\n");
		
		//Display all apples and prices
		System.out.println("All apple prices:");
		for(Apple a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() + " cents.");
	}
}