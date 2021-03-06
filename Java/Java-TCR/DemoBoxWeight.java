// This program uses inheritance to extend box

class Box
{
	double width;
	double height;
	double depth;
	
	//contruct clone of an object
	Box(Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	//contructor used when all dimensions specified
	Box(double w, double h, double d)
	{
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	
	//constructor used when no dimensions specified
	Box()
	{
		width = -1;
		height = -1;
		depth = -1;
	}
	
	//constructor used when cube is created
	Box(double len)
	{
		this.width = this.height = this.depth = len;
	}
	
	//compute and return the volume
	double volume()
	{
		return width * height * depth;
	}
}

// Here. Box is extended to include weight
class BoxWeight extends Box
{
	double weight;	//weight of the box
	
	//contructor for box weight
	BoxWeight(double w, double h, double d, double m)
	{
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
}

class DemoBoxWeight
{
	public static void main(String args[])
	{
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		
		vol = mybox2.volume();
		System.out.println("\nVolume of mybox2 is " + vol);
		System.out.println("Weight os mybox2 is " + mybox2.weight);
	}
}