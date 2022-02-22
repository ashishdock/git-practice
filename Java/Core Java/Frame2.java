//Multiple Frames with Frame1 and Frame2

//this is Frame2

import java.awt.*;
import java.awt.event.*;

class Frame2 extends Frame implements ActionListener
{
	//create a button
	Button b;
	
	Frame2()
	{
		//set the layout to flow layout
		setLayout(new FlowLayout());
		
		//create the button
		b = new Button("Back");
		
		//add it to frame
		add(b);
		
		//add action listener to button
		b.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//remove this frame from memory
		this.dispose();
	}
}
