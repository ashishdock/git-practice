// A simple frame with background color and text

import javax.swing.*;
import java.awt.*; //Container class

class FrameDemo4 extends JFrame
{
	//vars
	JLabel lbl;
	
	FrameDemo4()
	{
		//create content pane
		Container c = this.getContentPane();
		
		//set the layout manager to c
		c.setLayout(new FlowLayout());
		
		//set the background color for the content pane c
		c.setBackground(Color.green);
		
		//create a label with some text
		lbl = new JLabel("Hello World!");
		
		//set font for label
		lbl.setFont(new Font("Impact", Font.BOLD, 34));
		
		//set red color for label
		lbl.setForeground(Color.red);
		
		//add the label to content pane
		c.add(lbl);
	}
	
	public static void main(String args[])
	{
		//create the frame
		FrameDemo4 obj = new FrameDemo4();
		
		//set a title for the frame
		obj.setTitle("My Swing Frame");
		
		//set size
		obj.setSize(800,600);
		
		//display the frame
		obj.setVisible(true);
		
		//close the application upon clicking on close button of frame
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
