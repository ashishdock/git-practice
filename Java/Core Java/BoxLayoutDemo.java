// Box Layout Demo

import java.awt.*;
import javax.swing.*;

class BoxLayoutDemo extends JFrame
{
	BoxLayoutDemo()
	{
		//create container and set flow layout
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//create a JPanel object which holds components
		MyPanel1 mpl = new MyPanel1();
		
		//add the panel to content pane
		c.add(mpl);
		
		//create another JPanel object which holds another set
		MyPanel2 mp2 = new MyPanel2();
		
		//add the panelto content pane
		c.add(mp2);
	}
	
	public static void main(String args[])
	{
		//create the frame
		BoxLayoutDemo demo = new BoxLayoutDemo();
		demo.setSize(800,600);
		demo.setTitle("My BoxLayoutDemo");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MyPanel1 extends JPanel
{
	MyPanel1()
	{
		//create BoxLayout object to arrange components along x-axis
		BoxLayout box1 = new BoxLayout(this, BoxLayout.X_AXIS);
		
		//set box layout to JPanel
		setLayout(box1);
		
		//create 3 push buttons and add them to panel using box layout
		JButton b1, b2, b3;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		
		add(b1);
		add(b2);
		add(b3);
	}
}

class MyPanel2 extends JPanel
{
	MyPanel2()
	{
		//create BoxLayout object to arrange components along Y-axis
		BoxLayout box2 = new BoxLayout(this, BoxLayout.Y_AXIS);
		
		//set BoxLayout to JPanel
		setLayout(box2);
		
		//create 3 push buttons and add them to panel using box layout
		JButton b1, b2, b3;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		
		add(b1);
		add(b2);
		add(b3);
	}
}