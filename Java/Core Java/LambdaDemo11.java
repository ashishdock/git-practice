//In this program, push button works with lambda expression - version 2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LambdaDemo11
{
	public static void main(String args[])
	{
		//create a push button with label
		JButton but = new JButton("Click the button");
		
		//here, we are passing lambda expression to addActionListener method
		but.addActionListener(e -> { System.out.println("Lambda expression demo");});
		
		//create frame
		JFrame f = new JFrame("Understanding lambda expressions");
		f.add(but);
		f.setSize(800,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}