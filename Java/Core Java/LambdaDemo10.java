//A program to display a message when a push button is clicked using anonymous inner class
//In this program, push button works with Anonymous inner class

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class LambdaDemo10
{
	public static void main(String args[])
	{
		//create a push button with label
		JButton but = new JButton("Click this Button");
		
		//here we are passing anonymous inner class object to addActionListener() method
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println("Anonymous inner class demo.");
			}
		});
		
		//create frame
		JFrame f = new JFrame("Understanding lambda expressions");
		
		//add button to the frame
		f.add(but);
		
		f.setSize(800,600);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}