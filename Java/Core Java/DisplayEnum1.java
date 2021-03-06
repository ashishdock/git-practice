// Retrieving enumeration constants and values

enum Planets
{
	/* Constants in the enumeration, each with 2 values. Planets name, distance and mass */
	Mercury(57910, 3.30e23), Venus(108200, 4.87e24), Earth(149600, 5.98e24), Mars(227940, 6.42e23), Jupiter(778330, 1.90e27);
	
	//take 2 variables to represent the 2 values
	private long distance;
	private double mass;
	
	//initialize the two variables
	Planets(long x, double y)
	{
		distance = x;
		mass = y;
	}
	
	//to retrieve distance values from enum
	long getDistance()
	{
		return distance;
	}
	
	//to retrieve mass values from enum
	double getMass()
	{
		return mass;
	}
}

class DisplayEnum1
{
	public static void main(String args[])
	{
		//this is for heading
		System.out.println("PLANET" + "\t\t" + "DISTANCE(km)" + "\t" + "MASS(Kg)");
		
		//display all constants names and values
		for(Planets p: Planets.values())
		{
			System.out.print(p + "\t\t");
			System.out.print(p.getDistance() + "\t\t");
			System.out.print(p.getMass() + "\n");
		}
	}
}