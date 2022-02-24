//Flow layout demo

import java.awt.*;
import javax.swing.*;

class FlowLayoutDemo extends JFrame
{
	FlowLayoutDemo()
	{
		//create content pane
		Container c = getContentPane();
		
		//create Flowlayout object with alignment right
		FlowLayout obj = new FlowLayout(FlowLayout.RIGHT, 10, 10);
		
		//set the layout to content pane
		c.setLayout(obj);
		
		//create 4 push buttons
		JButton b1, b2, b3, b4;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");
		
		//when we add the buttons to c, they are added as per flow layout
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
	}
	
	public static void main(String args[])
	{
		//create frame
		FlowLayoutDemo demo = new FlowLayoutDemo();
		demo.setTitle("My FlowLayoutDemo");
		demo.setSize(800,600);
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}