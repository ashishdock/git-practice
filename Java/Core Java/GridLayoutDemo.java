//GridLayout Demo

import java.awt.*;
import javax.swing.*;

class GridLayoutDemo extends JFrame
{
	GridLayoutDemo()
	{
		//create Container
		Container c = getContentPane();
		
		//create grid layout with 2 rows, 3 cols and 50 px gap between components
		GridLayout grid = new GridLayout(2,3,50,50);
		c.setLayout(grid);
		
		//create 5 push buttons
		JButton b1, b2, b3, b4, b5;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");
		b5 = new JButton("Button5");
		
		//add buttons to c
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
	}
	
	public static void main(String args[])
	{
		//create a frame
		GridLayoutDemo demo = new GridLayoutDemo();
		demo.setTitle("My GridLayoutDemo");
		demo.setSize(800,600);
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}