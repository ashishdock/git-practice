//JColorChooser demo

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JColorChooserDemo extends JFrame implements ActionListener
{
	//vars
	JButton b;
	Container c;
	
	JColorChooserDemo()
	{
		//create the content pane
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//create a push button
		b = new JButton("Select a color");
		
		//add button to content pane
		c.add(b);
		
		//add action listener to button
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//take the initial color as null
		Color selectedcolor = null;
		
		//create the color chooser with dialog box to select a color
		Color color = JColorChooser.showDialog(this, "Select a color", selectedcolor);
		
		//if color is not null then some color is selected
		if(color != null)
		{
			//get the selected color
			selectedcolor = color;
		}
		
		//show background color of frame with the selected color
		c.setBackground(color);
	}
	
	public static void main(String args[])
	{
		//create the frame
		JColorChooserDemo demo = new JColorChooserDemo();
		demo.setSize(800,600);
		demo.setTitle("My JToolBarDemo");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}