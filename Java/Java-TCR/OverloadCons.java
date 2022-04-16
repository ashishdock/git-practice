class Box
{
	double width;
	double height;
	double depth;
	
	// constructor used when all dimensions are specified
	Box(double w, double h, double d)
	{
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	
	// constructor used when no dimensions are specified
	Box()
	{
		width = -1;  //use -1 to indicate
		height = -1; // an initialized
		depth = -1; // box
	}
	
	// constructor used when cube is created
	Box(double len)
	{
		width = height = depth = len;
	}
	
	// compute and return volume
	double volume()
	{
		return width * height * depth;
	}
}

class OverloadCons
{
	public static void main(String args[])
	{
		//create boxes using the various constructors
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mybox3 = new Box(9);
		
		double vol;
		
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		
		//get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		
		//get the volume of third box
		vol = mybox3.volume();
		System.out.println("Volume of mycube is " + vol);
	}
}