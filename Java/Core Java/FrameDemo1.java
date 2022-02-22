// A simple frame that exits on close

import javax.swing.*;

class FrameDemo1 extends JFrame
{
	public static void main(String args[])
	{
		//create the frame
		FrameDemo1 obj = new FrameDemo1();
		
		//set a title for the frame
		obj.setTitle("My Swing Frame");
		
		//set the size 
		obj.setSize(800,600);
		
		//display the frame
		obj.setVisible(true);
		
		//close the application upon clicking on close button of frame
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}