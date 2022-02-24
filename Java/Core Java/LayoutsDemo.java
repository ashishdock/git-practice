// Using border layout inside car layout

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class LayoutsDemo extends JFrame implements ActionListener
{
	//vars
	Container c;
	CardLayout card;
	JButton b1;
	
	LayoutsDemo()
	{
		//create Container
		c = getContentPane();
		
		//create CardLayout object w
		card = new CardLayout();
		
		//set the layout to card layout
		c.setLayout(card);
		
		//create a push button
		b1 = new JButton("Button1");
		
		//add button to c on first card
		c.add("First card", b1);
		
		//add panel object to c on second card
		//MyPanel is the sub class of Panel class
		c.add("Second card", new MyPanel());
		
		//add actionListener to buttons
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//when a button is clicked show the second card
		card.next(c);
	}
	
	public static void main(String args[])
	{
		//create a frame
		LayoutsDemo demo = new LayoutsDemo();
		demo.setSize(800,600);
		demo.setTitle("My LayoutsDemo");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MyPanel extends JPanel
{
	//vars
	JTextField tf;
	JCheckBox cb;
	JButton b;
	
	MyPanel()
	{
		//set border layout to panel
		this.setLayout(new BorderLayout());
		
		//create components
		tf = new JTextField("Text Field", 15);
		b = new JButton("OK");
		cb = new JCheckBox("Check Box");
		
		//add them to panel
		this.add("North", tf);
		this.add("South", b);
		this.add("East", cb);
	}
}
