//Push buttons - version 2

import java.awt.*;
import java.awt.event.*;

class Mybuttons2 extends Frame implements ActionListener
{
	//vars
	Button b1, b2, b3;
	
	Mybuttons2()
	{
		//do not set any layout
		setLayout(new FlowLayout());
		
		//create 3 push buttons
		b1 = new Button("Yellow");
		b2 = new Button("Blue");
		b3 = new Button("Pink");
		
		//add the buttons to the frame
		add(b1);
		add(b2);
		add(b3);
		
		//add action listener to the buttons
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//close the frame
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	} //end of constructor
	
	//this method is called when a button is clicked
	public void actionPerformed(ActionEvent ae)
	{
		//know the button clicked by user
		
		if(ae.getSource() == b1) setBackground(Color.yellow);
		if(ae.getSource() == b2) setBackground(Color.blue);
		if(ae.getSource() == b3) setBackground(Color.pink);
	}
	
	public static void main(String args[])
	{
		//create the frame
		Mybuttons2 mb = new Mybuttons2();
		mb.setSize(400,400);
		mb.setTitle("My buttons");
		mb.setVisible(true);
	}
}