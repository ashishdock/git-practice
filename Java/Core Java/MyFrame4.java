// Creating a frame and closing it

import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame
{
	public static void main(String args[])
	{
		//create a frame with title
		MyFrame4 f = new MyFrame4();
		
		//set a title for the frame
		f.setTitle("My AWT Frame");
		
		//set the size of the frame
		f.setSize(800,600);
		
		//display the frame
		f.setVisible(true);
		
		//close the frame
		f.addWindowListener(new MyClass());
	}
}

class MyClass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}