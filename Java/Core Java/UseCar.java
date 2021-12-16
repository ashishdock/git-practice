//Using cars
class UseCar
{
	public static void main(String args[])
	{
		//create sub class objects
		Maruti m = new Maruti(1001);	//1001 is registration no.
		Santro s = new Santro(5005);	//5005 is registration no.
		
		//create a reference to super class: Car
		Car ref;
		//to use Maruti car
		ref = m;
		
		//use the features of the car
		ref.openTank();
		ref.steering(1, 90);
		ref.braking(500);		
		
		//to use Santro car
		ref = s;
		
		ref.openTank();
		ref.steering(2, 55);
		ref.braking(300);
		
	}
}