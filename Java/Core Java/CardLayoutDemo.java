//Card Layout Demo

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CardLayoutDemo extends JFrame implements ActionListener
{
	//vars
	Container c;
	CardLayout card;
	JButton b1, b2, b3, b4;
	
	CardLayoutDemo()
	{
		//create container
		c = getContentPane();
		
		//create CardLayout object with 50px horizontal space and 10 px vertical space
		card = new CardLayout(50, 10);
		
		//set the layout to card layout
		c.setLayout(card);
		
		//create 4 push buttons
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");
		
		//add each button to c on a separate card
		c.add("First card", b1);
		c.add("Second card", b2);
		c.add("Third card", b3);
		c.add("Fourth card", b4);
		
		//add action listeners to buttons
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//when a button is clicked show the next card
		card.next(c);
	/*	To show a particular card, e.g. Third card, we can use as:
		card.show(c, "Third card");
	*/	
	}
	
	public static void main(String args[])
	{
		//create frame
		CardLayoutDemo demo = new CardLayoutDemo();
		demo.setSize(800,600);
		demo.setTitle("My CardLayoutDemo");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}