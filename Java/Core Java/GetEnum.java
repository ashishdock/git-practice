//Program to know how to create an enumeration with constants, instance variable, constructor and a method

import java.io.*;

enum IceCream
{
	//Constants with values
	Vanilla(20.00), Chocolate(22.50), Strawberry(23.00), Raspberry(25.00);
	
	//an instance variable
	private double price;
	
	// a parameterized constructor which initializes price with p
	IceCream(double p)
	{
		price = p;
	}
	
	//a static method to display the price upon taking the sequence number
	static void getPrice(int i)
	{
		IceCream allicecreams[] = IceCream.values();
		//System.out.println(allicecreams[i]);
		System.out.println("Pay Rs. " + allicecreams[i].price);
	}
} // end of enumeration

class GetEnum
{
	public static void main(String args[]) throws IOException
	{
		//Display all the ice creams available from the enumeration.
		System.out.println("AVAILABLE ICECREAMS");
		
		
		for(IceCream ice: IceCream.values())
		{
			//ordinal() method starts counting from 0
			int no = ice.ordinal();
			System.out.println(no + " " + ice);
		}
		
		//Get the user choice as a number
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Your choice: ");
		int choice = Integer.parseInt(br.readLine());
		IceCream.getPrice(choice);
	}
}