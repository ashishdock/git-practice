//A superclass variable can reference a sub class variable

class RefDemo
{
	public static void main(String args[])
	{
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();
		double vol;
		
		vol = weightbox.volume();
		System.out.println("Volume of weightbox is " + vol);
		System.out.println("Weight of weightbox is " + weightbox.weight);
		
		//assign BoxWeight reference to Box reference
		plainbox = weightbox;
		
		vol = plainbox.volume();	//OK, volume() define in box
		System.out.println("Volume of plainbox is " + vol);
		
		// The following statement is invalid because plainbox does not define weight member
		// System.out.println("Weight of plainbox is " + plainbox.weight);
	}
}
