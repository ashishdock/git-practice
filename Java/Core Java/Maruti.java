class Maruti extends Car
{
	//store regno in super class var
	Maruti(int regno)
	{
		super(regno);
	}
	
	//Maruti uses ordinary steering
	void steering(int direction, int angle)
	{
		System.out.println("Take a turn");
		System.out.println("This is ordinary steering");
	}
	
	//Maruti uses hydraulic brakes
	void braking(int force)
	{
		System.out.println("Brakes applied");
		System.out.println("These are hydraulic brakes");
	}
}