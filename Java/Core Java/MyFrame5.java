// Creating a frame a closing it. This time using ANONYMOUS INNER CLASS

import java.awt.*;
import java.awt.event.*;

class MyFrame5 extends Frame
{
	public static void main(String args[])
	{
		//create a frame with title
		MyFrame5 f = new MyFrame5();
		
		//set a title for the frame
		f.setTitle("My AWT Frame");
		
		//set the size of the frame
		f.setSize(800,600);
		
		//display the frame
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}