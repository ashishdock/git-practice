//GridBagLayout demo

import java.awt.*;
import javax.swing.*;

class GridBagLayoutDemo extends JFrame
{
	//vars
	GridBagLayout gbag;
	GridBagConstraints cons;
	
	GridBagLayoutDemo()
	{
		//get the content pane
		Container c = getContentPane();
		
		//create GridBagLayout object
		gbag = new GridBagLayout();
		
		//set gridbag layout to content pane
		c.setLayout(gbag);
		
		//create GridBag constraints object
		cons = new GridBagConstraints();
		
		//create 5 push buttons
		JButton b1, b2, b3, b4, b5;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");
		b5 = new JButton("Button5");
		
		//for all buttons, use horizontal filling
		cons.fill = GridBagConstraints.HORIZONTAL;
		
		//display button1 at x, y coordinates 0,0
		cons.gridx = 0;
		cons.gridy = 0;
		
		//resize all the components when the frame is resized
		cons.weightx = 0.7;
		cons.weighty = 0.7;
		
		//set the above constraints to button1
		gbag.setConstraints(b1,cons);
		
		//add button1 to content pane
		c.add(b1);
		
		//display button2 at x,y coordinates 1,0
		cons.gridx = 1;
		cons.gridy = 0;
		
		//remaining constraints applicable as set for previous button
		//set constraints to button2
		gbag.setConstraints(b2, cons);
		c.add(b2);
		
		//display button3 at x,y coordinates 2,0
		cons.gridx = 2;
		cons.gridy = 0;
		
		//remaining constraints applicable as set for previous button
		//set constraints for button3
		gbag.setConstraints(b3, cons);
		c.add(b3);
		
		//display button4 at x,y coordinates 0,1
		cons.gridx = 0;
		cons.gridy = 1;
		
		//add 100px height wise
		cons.ipady = 100;
		
		//let button4 occupy 3 columns width wise
		cons.gridwidth = 3;
		
		//remaining constraints applicale as set from previous button
		//set constraints to button4
		gbag.setConstraints(b4, cons);
		c.add(b4);
		
		//display button5 at x,y coordinates 1,2
		cons.gridx = 1;
		cons.gridy = 2;
		
		//reset the ipady value to 0
		cons.ipady = 0;
		
		//leave space above the button for resizing vertically
		cons.weighty = 0.8;
		
		//position the button starting from center of bottom line
		cons.anchor = GridBagConstraints.PAGE_END;
		
		//leave 50px space at bottom of button5
		cons.insets = new Insets(0,0,50,0);
		
		//let the button occupy 2 columns width
		cons.gridwidth = 2;
		
		//set constraints to button5
		gbag.setConstraints(b5, cons);
		c.add(b5);
	}
	
	public static void main(String args[])
	{
		GridBagLayoutDemo demo = new GridBagLayoutDemo();
		demo.setTitle("My GridBagLayoutDemo");
		demo.setSize(800,600);
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}