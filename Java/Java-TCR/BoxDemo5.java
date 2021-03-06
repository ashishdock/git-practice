//This program uses a parameterized method

class Box
{
	double width;
	double height;
	double depth;
	
	//compute and return volume
	double volume()
	{
		return width * height * depth;
	}
	
	void setDim(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}
}

class BoxDemo5
{
	public static void main(String args[])
	{
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		//initialize each box
		mybox1.setDim(10, 20, 15);
		mybox2.setDim(3, 6, 9);
		
		//get the volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		//get the colume of the second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}
}