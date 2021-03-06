// Creating a vertical scrollbar

import java.awt.*;
import java.awt.event.*;

class Myscroll extends Frame implements AdjustmentListener
{
	//vars
	String msg = "";
	Scrollbar s1;
	
	Myscroll()
	{
		//do not set any layout
		setLayout(null);
		
		//create a vertical scrollbar
		s1 = new Scrollbar(Scrollbar.VERTICAL, 0,30,0,400);
		
		//set the location of scrollbar in the frame
		s1.setBounds(250,50,30,200);
		
		//add it to frame
		add(s1);
		
		//add adjustment listener to scrollbar
		s1.addAdjustmentListener(this);
		
		//frame closing
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		repaint(); // call paint
	}
	
	public void paint(Graphics g)
	{
		//display the position of scrollbar
		g.drawString("SCROLLBAR POSITION: ", 20,150);
		msg += s1.getValue();
		g.drawString(msg, 20, 180);
		msg = "";
	}
	
	public static void main(String args[])
	{
		Myscroll ms = new Myscroll();
		ms.setTitle("My Scroll");
		ms.setSize(800,600);
		ms.setVisible(true);
	}
}