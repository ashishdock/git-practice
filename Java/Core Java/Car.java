//This is an abstract class
abstract class Car
{
	//every car will have a registration number
	int regno;
	
	//initialize the value of regno
	Car(int r)
	{
		regno = r;
	}
	
	//all cars will have a fuel tank and same mechanism to open the tank
	void openTank()
	{
		System.out.println("Fill the tank");
	}
	
	//all cars will have steering but different cars will have different steering mechanisms
	abstract void steering(int direction, int angle);
	
	//all cars will have brakes but different cars will have different braking mechanisms
	abstract void braking(int force);
}

