class Santro extends Car
{
	Santro(int regno)
	{
		super(regno);
	}
	
	void steering(int direction, int angle)
	{
		System.out.println("Take a turn");
		System.out.println("This car uses power steering");
	}
	
	//Santro uses gas brakes
	void braking(int force)
	{
		System.out.println("Brakes applied");
		System.out.println("This car uses gas brakes");
	}
}
