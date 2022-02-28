// A complete implementation of BoxWeight

class Box
{
	private double width;
	private double height;
	private double depth;
	
	//contruct clone of an object
	Box(Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	//constructor used when all dimensions specified
	Box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	
	//contructor used when no dimensions specified
	Box()
	{
		width = -1;
		height = -1;
		depth = -1;
	}
	
	//contructor used when cube is created
	Box(double len)
	{
		width = height = depth = len;
	}
	
	//compute and return volume
	double volume()
	{
		return width * height * depth;
	}
}

//BoxWeight now fully implements all parameters
class BoxWeight extends Box
{
	double weight;
	
	BoxWeight(BoxWeight ob) //pass object to constructor
	{
		super(ob);
		weight = ob.weight;
	}
	
	//contructor when all parameters are specified
	BoxWeight(double w, double h, double d, double m)
	{
		super(w, h, d);	//call super class constructor
		this.weight = m;
	}
	
	//default constructor
	BoxWeight()
	{
		super();
		weight = -1;
	}
	
	//constructor when cube is created
	BoxWeight(double len, double m)
	{
		super(len);
		weight = m;
	}
}

class DemoSuper
{
	public static void main(String args[])
	{
		
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 120.076);
		BoxWeight mybox3 = new BoxWeight();	//default
		BoxWeight mycube = new BoxWeight(3, 2);
		BoxWeight myclone = new BoxWeight(mybox1);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		
		vol = mybox2.volume();
		System.out.println("\nVolume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);
		
		vol = mybox3.volume();
		System.out.println("\nVolume of mybox3 is " + vol);;
		System.out.println("Weight of mybox3 is " + mybox3.weight);
		
		vol = mycube.volume();
		System.out.println("\nVolume of mycube is " + vol);;
		System.out.println("Weight os mycube is " + mycube.weight);
		
		vol = myclone.volume();
		System.out.println("\nVolume of myclone is " + vol);
		System.out.println("Weight of myclone is " + myclone.weight);
	}
}