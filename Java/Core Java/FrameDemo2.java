// A simple frame with background color

import javax.swing.*;
import java.awt.*; //container class

class FrameDemo2 extends JFrame
{
	public static void main(String args[])
	{
		//create the frame
		FrameDemo2 obj = new FrameDemo2();
		
		//create content pane. It is nothing but container object c
		Container c = obj.getContentPane();
		
		//set green background color to c
		c.setBackground(Color.green);
		
		//set a title for the frame
		obj.setTitle("My Swing Frame");
		
		//set the size 
		obj.setSize(800,600);
		
		//display the frame
		obj.setVisible(true);
		
		//close the application upon clicking on close button
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}