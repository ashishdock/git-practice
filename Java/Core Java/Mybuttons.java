//Push buttons

import java.awt.*;
import java.awt.event.*;

class Mybuttons extends Frame implements ActionListener
{
	//vars
	Button b1,b2,b3;
	
	Mybuttons()
	{
		//do not set any layout
		this.setLayout(null);
		
		//create 3 push buttons
		b1 = new Button("Yellow");
		b2 = new Button("Blue");
		b3 = new Button("Pink");
		
		//set the locations of buttons in the frame
		b1.setBounds(100,100,70,40);
		b2.setBounds(100,160,70,40);
		b3.setBounds(100,220,70,40);
		
		//add the buttons to the frame
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
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
	} //end of constructot
	
	//this method is called when a button is clicked
	public void actionPerformed(ActionEvent ae)
	{
		//know the label of the button clicked by user
		String str = ae.getActionCommand();
		
		//change the frame's background color depending on the button clicked
		if(str.equals("Yellow")) this.setBackground(Color.yellow);
		if(str.equals("Blue")) this.setBackground(Color.blue);
		if(str.equals("Pink")) this.setBackground(Color.pink);
	}
	
	public static void main(String args[])
	{
		//create the frame
		Mybuttons mb = new Mybuttons();
		
		//set the size and title
		mb.setTitle("My Buttons");
		mb.setSize(400,400);
		
		mb.setVisible(true);
	}
	
}