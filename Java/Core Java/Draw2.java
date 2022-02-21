// Drawing a smiling face in a frame with filled colors

import java.awt.*;
import java.awt.event.*;

class Draw2 extends Frame
{
	Draw2()
	{
		//close the frame
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g)
	{
		//set blue color
		g.setColor(Color.blue);
		
		//display a rectangle to contain drawing
		g.fillRect(40,40,200,200);
		
		//set yellow color
		g.setColor(Color.yellow);
		
		//face
		g.fillOval(90,70,80,80);
		
		//set black color
		g.setColor(Color.black);
		
		//eyes
		g.fillOval(110,95,5,5);
		g.fillOval(145,95,5,5);
		
		//nose
		g.drawLine(130,95,130,115);
		
		//set red color
		g.setColor(Color.red);
		
		//mouth
		g.fillArc(113,115,35,20,0,-180);
	}
	
	public static void main(String args[])
	{
		//create the frame
		Draw2 d = new Draw2();
		
		//set the size and title
		d.setSize(400,400);
		d.setTitle("My Drawing");
		
		//display the frame
		d.setVisible(true);
	}
}