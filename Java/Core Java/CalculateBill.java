//Calculate electricity bill for commercial and domestic plans
abstract class Plan
{
	
	//take rate as protected to access it in sub classes
	protected double rate;
	
	//accept rate into rate variable, since rate will change depending on plan, we declare abstract methods
	public abstract void getRate();
	
	//calculate the electricity bill by taking units
	public void calculateBill(int units)
	{
		System.out.print("Bill amount for " + units + " units: ");
		System.out.println(rate*units);
	}
}

class CommercialPlan extends Plan
{
	
	//store Commerical rate as Rs 5.00 per unit
	public void getRate()
	{
		rate = 5.00;
	}
}

class DomesticPlan extends Plan
{
	public void getRate()
	{
		rate = 2.60;
	}
}

class CalculateBill
{
	public static void main(String args[])
	{
		
		//create reference p to abstract class
		Plan p;
		
		//Calculate commercial bill for 250 units
		System.out.println("Commercial connection: ");
		p = new CommercialPlan(); //use reference to refer to sub class
		//object
		p.getRate();
		p.calculateBill(250);
		
		System.out.println();
		
		//calculate bill for domestic plan
		System.out.println("Domestic Connection: ");
		p = new DomesticPlan();
		p.getRate();
		p.calculateBill(250);
		
	}
}