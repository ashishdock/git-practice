//callback mechanism using interfaces in Java
//creating an Interface
interface Tax
{
	double stateTax();
}

//implementation class for AP state tax
class AP implements Tax
{
	public double stateTax()
	{
		System.out.println("According to AP Govt rules");
		return 5000.50;
	}
}

//implementation class for example Karnataka state tax
class Karnataka implements Tax
{
	public double stateTax()
	{
		System.out.println("According to Karnataka Govt. rules");
		return 2000.00;
	}
}

class TaxApp
{
	public static void main(String args[]) throws Exception
	{
		//Accept the statename through command line arguments, the state name is stored in object c
		Class c = Class.forName(args[0]);
		//create a new object to that class whose name is in c. Tax interface reference is referencing that new object
		Tax ref = (Tax)c.newInstance();
		//call the method to calculate total tax and pass interface reference - this is callback
		//Here, ref may refer to stateTax() of AP or Karnataka classes depending on the class for which the object is created in the previous staep
		calculateTax(ref);
		
	}
	
	static void calculateTax(Tax t)
	{
		//calculate central tax
		double ct = 1000.00;
		//calculate state tax
		double st = t.stateTax();
		//display total tax
		System.out.println("Total tax = " + (ct + st));
	}
}

