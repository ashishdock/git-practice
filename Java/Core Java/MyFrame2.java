// Creating a frame - version 2

import java.awt.*;

class MyFrame2 extends Frame
{
	//call super class constructor to store title
	MyFrame2(String str)
	{
		super(str);
	}
	public static void main(String args[])
	{
		//create a frame with Title
		MyFrame2 f = new MyFrame2("My AWT Frame");
		
		//set the size of the frame
		f.setSize(500,500);
		
		//display the frame
		f.setVisible(true);
	}
}