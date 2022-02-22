// A simple frame with bg color and text

import javax.swing.*;
import java.awt.*; //container class

class MyPanel extends JPanel
{
	MyPanel()
	{
		this.setBackground(Color.green);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.red);
		g.setFont(new Font("Helvetica", Font.BOLD, 34));
		g.drawString("Hello World!", 50, 100);
	}
}

class FrameDemo3 extends JFrame
{
	FrameDemo3()
	{
		//create content pane
		Container c = this.getContentPane();
		
		//create MyPanel object and add it to c
		MyPanel mp = new MyPanel();
		c.add(mp);
	}
	
	public static void main(String args[])
	{
		//create the frame
		FrameDemo3 obj = new FrameDemo3();
		
		//set a title
		obj.setTitle("My Swing Frame");
		
		//set size
		obj.setSize(800,600);
		
		//display the frame
		obj.setVisible(true);
		
		//close the application
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
