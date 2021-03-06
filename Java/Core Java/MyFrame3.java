//creating a frame and closing it

import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame
{
	public static void main(String args[])
	{
		//create a frame with title
		MyFrame3 f = new MyFrame3();
		
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

class MyClass implements WindowListener
{
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}