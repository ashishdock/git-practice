//create a Color enumeration with color names as constants

enum Color{
	RED, GREEN, BLUE, WHITE, BLACK
}

//we want to use the Color enumeration in this class

class ColorTest
{
	//enumeration constant is declared as instance variable
	Color c;
	
	//initialize the variable
	ColorTest(Color c)
	{
		this.c = c;
	}
	
	/* This method displays the color name depending on the constant. if BLACK color is given, it will display 'Not a good color'*/
	
	void display()
	{
		switch(c)
		{
			case RED: System.out.println("Red color"); break;
			case GREEN: System.out.println("Green color"); break;
			case BLUE: System.out.println("Blue color"); break;
			case WHITE: System.out.println("White color"); break;
			default: System.out.println("Not a good color"); break;
		}
	}
	
	public static void main(String args[])
	{
		//create colorTest object and pass a color as choice
		ColorTest ct = new ColorTest(Color.GREEN);
		//call display() method to display the color name
		ct.display();
	}
}